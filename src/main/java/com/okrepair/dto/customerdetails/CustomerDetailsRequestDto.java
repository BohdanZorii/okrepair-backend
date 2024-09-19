package com.okrepair.dto.customerdetails;

public record CustomerDetailsRequestDto(
        String name,
        String lastName,
        String email,
        String address,
        String zipCode,
        String phoneNumber
) {
}
