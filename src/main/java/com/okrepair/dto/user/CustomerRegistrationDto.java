package com.okrepair.dto.user;

public record CustomerRegistrationDto(
        String email,
        String password,
        String repeatPassword,
        String phoneNumber,
        String firstName,
        String lastName
) {
}
