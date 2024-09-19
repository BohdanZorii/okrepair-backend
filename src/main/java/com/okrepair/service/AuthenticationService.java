package com.okrepair.service;

import com.okrepair.dto.user.UserLoginRequestDto;
import com.okrepair.dto.user.UserLoginResponseDto;
import org.springframework.security.core.Authentication;

public interface AuthenticationService {
    UserLoginResponseDto authenticate(UserLoginRequestDto request);

    Long getAuthenticatedUserId(Authentication authentication);
}
