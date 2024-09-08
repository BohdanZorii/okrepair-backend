package com.okrepair.service;

import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.dto.user.UserResponseDto;
import com.okrepair.exception.RegistrationException;

public interface UserService {
    UserResponseDto registerCustomer(CustomerRegistrationDto customerRegistrationDto)
            throws RegistrationException;

    //UserResponseDto getById(Long userId);
}
