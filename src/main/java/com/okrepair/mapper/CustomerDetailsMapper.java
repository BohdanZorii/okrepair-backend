package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.model.CustomerDetails;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface CustomerDetailsMapper {
    CustomerDetails toModel(CustomerRegistrationDto dto);
}
