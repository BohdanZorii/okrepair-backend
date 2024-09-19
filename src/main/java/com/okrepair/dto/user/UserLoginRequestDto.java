package com.okrepair.dto.user;

public record UserLoginRequestDto(
        String email,
        String password
) {
}
