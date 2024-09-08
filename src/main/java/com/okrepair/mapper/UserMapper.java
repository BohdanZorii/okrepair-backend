package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.dto.user.UserResponseDto;
import com.okrepair.model.Device;
import com.okrepair.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toModel(CustomerRegistrationDto dto);

    @Mapping(target = "phoneNumber", source = "customerDetails.phoneNumber")
    @Mapping(target = "firstName", source = "customerDetails.firstName")
    @Mapping(target = "lastName", source = "customerDetails.lastName")
    UserResponseDto toDto(User user);

    void updateDeviceFromDto(@MappingTarget Device device, DeviceRequestDto dto);
}
