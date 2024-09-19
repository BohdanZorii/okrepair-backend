package com.okrepair.controller;

import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.dto.user.UserLoginRequestDto;
import com.okrepair.dto.user.UserLoginResponseDto;
import com.okrepair.dto.user.UserResponseDto;
import com.okrepair.exception.RegistrationException;
import com.okrepair.service.AuthenticationService;
import com.okrepair.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
//@Validated
@RequiredArgsConstructor
public class AuthenticationController {
    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/registration")
    public UserResponseDto register(@RequestBody CustomerRegistrationDto request)
            throws RegistrationException {
        return userService.registerCustomer(request);
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody UserLoginRequestDto request) {
        return authenticationService.authenticate(request);
    }
}
