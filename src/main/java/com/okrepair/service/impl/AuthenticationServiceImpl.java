package com.okrepair.service.impl;

import com.okrepair.dto.user.UserLoginRequestDto;
import com.okrepair.dto.user.UserLoginResponseDto;
import com.okrepair.model.User;
import com.okrepair.security.JwtUtil;
import com.okrepair.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    @Override
    public UserLoginResponseDto authenticate(UserLoginRequestDto request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password()));
        String token = jwtUtil.generateToken(authentication.getName());
        return new UserLoginResponseDto(token);
    }

    @Override
    public Long getAuthenticatedUserId(Authentication authentication) {
        User authenticatedUser = (User) authentication.getPrincipal();
        return authenticatedUser.getId();
    }
}
