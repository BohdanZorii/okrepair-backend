package com.okrepair.dto.customerdetails;

public record CustomerDetailsResponseDto(
        Long id,
        String name,
        String lastName,
        String email,
        String address,
        String zipCode,
        String phoneNumber
) {
}
