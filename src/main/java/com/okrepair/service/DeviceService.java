package com.okrepair.service;

import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.device.DeviceResponseDto;
import java.util.List;

public interface DeviceService {
    List<DeviceResponseDto> findAll();

    DeviceResponseDto findById(Long id);

    DeviceResponseDto create(DeviceRequestDto dto);

    DeviceResponseDto update(Long id, DeviceRequestDto dto);

    void deleteById(Long id);
}
