package com.okrepair.service;

import com.okrepair.dto.customerdetails.CustomerDetailsDto;
import com.okrepair.dto.customerdetails.CustomerDetailsResponseDto;

public interface CustomerDetailsService {
    CustomerDetailsResponseDto create(CustomerDetailsDto customerDetailsDto);

    CustomerDetailsResponseDto update(Long customerId, CustomerDetailsDto customerDetailsDto);

    //CustomerDetailsResponseDto getById(Long customerId);

    //CustomerDetailsResponseDto getCustomerDetailsByPhoneNumber(String phoneNumber);
}

