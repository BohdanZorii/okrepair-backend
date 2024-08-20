package com.okrepair.service.impl;

import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.device.DeviceResponseDto;
import com.okrepair.mapper.DeviceMapper;
import com.okrepair.model.Device;
import com.okrepair.repository.DeviceRepository;
import com.okrepair.service.DeviceService;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
    private final DeviceRepository deviceRepository;
    private final DeviceMapper deviceMapper;

    @Override
    public List<DeviceResponseDto> findAll() {
        return deviceRepository.findAll().stream()
                .map(deviceMapper::toDto)
                .toList();
    }

    @Override
    public DeviceResponseDto findById(Long id) {
        Device device = deviceRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No device found by id " + id));
        return deviceMapper.toDto(device);
    }

    @Override
    public DeviceResponseDto create(DeviceRequestDto dto) {
        Device savedDevice = deviceRepository.save(deviceMapper.toModel(dto));
        return deviceMapper.toDto(savedDevice);
    }

    @Override
    public DeviceResponseDto update(Long id, DeviceRequestDto dto) {
        Device device = deviceRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No device found by id " + id));
        deviceMapper.updateDeviceFromDto(device, dto);
        Device updatedDevice = deviceRepository.save(device);
        return deviceMapper.toDto(updatedDevice);
    }

    @Override
    public void deleteById(Long id) {
        deviceRepository.deleteById(id);
    }
}
