package com.okrepair.service;

import com.okrepair.dto.device.DeviceBasicDto;
import com.okrepair.dto.device.DeviceDetailsDto;
import com.okrepair.dto.device.DeviceRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DeviceService {
    Page<DeviceBasicDto> findAll(Pageable pageable);

    DeviceDetailsDto findById(Long id);

    DeviceBasicDto create(DeviceRequestDto dto);

    DeviceBasicDto update(Long id, DeviceRequestDto dto);

    void deleteById(Long id);
}
