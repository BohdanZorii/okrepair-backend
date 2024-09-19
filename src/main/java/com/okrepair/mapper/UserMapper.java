package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.user.CustomerRegistrationDto;
import com.okrepair.dto.user.UserResponseDto;
import com.okrepair.model.Device;
import com.okrepair.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

@Mapper(config = MapperConfig.class, uses = CustomerDetailsMapper.class)
public interface UserMapper {
    User toModel(CustomerRegistrationDto dto);

    UserResponseDto toDto(User user);

    void updateDeviceFromDto(@MappingTarget Device device, DeviceRequestDto dto);

    @Named("userById")
    default User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
