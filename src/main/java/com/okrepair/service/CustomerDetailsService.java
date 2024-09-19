package com.okrepair.service;

import com.okrepair.dto.customerdetails.CustomerDetailsRequestDto;
import com.okrepair.dto.customerdetails.CustomerDetailsResponseDto;

public interface CustomerDetailsService {
    CustomerDetailsResponseDto create(CustomerDetailsRequestDto customerDetailsDto);

    CustomerDetailsResponseDto update(Long id, CustomerDetailsRequestDto customerDetailsDto);

    //CustomerDetailsResponseDto getById(Long customerId);

    //CustomerDetailsResponseDto getCustomerDetailsByPhoneNumber(String phoneNumber);
}

