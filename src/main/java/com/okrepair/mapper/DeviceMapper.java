package com.okrepair.mapper;

import com.okrepair.config.MapperConfig;
import com.okrepair.dto.device.DeviceBasicDto;
import com.okrepair.dto.device.DeviceDetailsDto;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.model.Device;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfig.class)
public interface DeviceMapper {
    Device toModel(DeviceRequestDto dto);

    DeviceBasicDto toBasicDto(Device device);

    DeviceDetailsDto toDetailsDto(Device device);

    void updateDeviceFromDto(@MappingTarget Device device, DeviceRequestDto dto);
}
