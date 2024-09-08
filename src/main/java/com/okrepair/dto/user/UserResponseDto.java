package com.okrepair.dto.user;

public record UserResponseDto(
        Long id,
        String email,
        String phoneNumber,
        String firstName,
        String lastName
) {
}
