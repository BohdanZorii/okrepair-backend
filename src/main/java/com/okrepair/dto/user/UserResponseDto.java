package com.okrepair.dto.user;

import com.okrepair.dto.customerdetails.CustomerDetailsResponseDto;

public record UserResponseDto(
        Long id,
        String email,
        CustomerDetailsResponseDto customerDetails
) {
}
