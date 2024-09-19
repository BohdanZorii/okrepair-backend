package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.customerdetails.CustomerDetailsRequestDto;
import com.okrepair.dto.customerdetails.CustomerDetailsResponseDto;
import com.okrepair.model.CustomerDetails;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface CustomerDetailsMapper {
    CustomerDetails toModel(CustomerDetailsRequestDto dto);

    CustomerDetailsResponseDto toDto(CustomerDetails customerDetails);
}
