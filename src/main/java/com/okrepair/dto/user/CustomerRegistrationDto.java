package com.okrepair.dto.user;

import com.okrepair.dto.customerdetails.CustomerDetailsRequestDto;

public record CustomerRegistrationDto(
        String email,
        String password,
        String repeatPassword,

        CustomerDetailsRequestDto customerDetails
) {
}
