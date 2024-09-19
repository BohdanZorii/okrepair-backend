package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.device.DeviceResponseDto;
import com.okrepair.model.Device;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfig.class)
public interface DeviceMapper {
    Device toModel(DeviceRequestDto dto);

    DeviceResponseDto toDto(Device device);

    void updateDeviceFromDto(@MappingTarget Device device, DeviceRequestDto dto);
}
