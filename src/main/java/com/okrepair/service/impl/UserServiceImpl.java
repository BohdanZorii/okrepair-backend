package com.okrepair.service.impl;

import static com.okrepair.model.Role.RoleName.ROLE_USER;

import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.dto.user.UserResponseDto;
import com.okrepair.exception.RegistrationException;
import com.okrepair.mapper.CustomerDetailsMapper;
import com.okrepair.mapper.UserMapper;
import com.okrepair.model.CustomerDetails;
import com.okrepair.model.User;
import com.okrepair.repository.CustomerDetailsRepository;
import com.okrepair.repository.RoleRepository;
import com.okrepair.repository.UserRepository;
import com.okrepair.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final CustomerDetailsRepository customerDetailsRepository;
    private final UserMapper userMapper;
    private final CustomerDetailsMapper customerDetailsMapper;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDto registerCustomer(CustomerRegistrationDto customerRegistrationDto)
            throws RegistrationException {
        String email = customerRegistrationDto.email();
        if (userRepository.existsByEmail(email)) {
            throw new RegistrationException("Email is already registered");
        }
        User user = userMapper.toModel(customerRegistrationDto);
        user.setPassword(passwordEncoder.encode(customerRegistrationDto.password()));
        CustomerDetails customerDetails = customerDetailsRepository.findByEmail(email)
                .orElse(customerDetailsMapper.toModel(customerRegistrationDto));
        user.setCustomerDetails(customerDetails);
        user.getRoles().add(roleRepository.getByRole(ROLE_USER));
        userRepository.save(user);
        return userMapper.toDto(user);
    }
}
