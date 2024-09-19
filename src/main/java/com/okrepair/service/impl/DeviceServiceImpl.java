package com.okrepair.service.impl;

import com.okrepair.dto.device.DeviceBasicDto;
import com.okrepair.dto.device.DeviceDetailsDto;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.mapper.DeviceMapper;
import com.okrepair.model.Device;
import com.okrepair.repository.DeviceRepository;
import com.okrepair.service.DeviceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
    private final DeviceRepository deviceRepository;
    private final DeviceMapper deviceMapper;

    @Override
    public Page<DeviceBasicDto> findAll(Pageable pageable) {
        return deviceRepository.findAll(pageable)
                .map(deviceMapper::toBasicDto);
    }

    @Override
    public DeviceDetailsDto findById(Long id) {
        Device device = deviceRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No device found by id " + id));
        return deviceMapper.toDetailsDto(device);
    }

    @Override
    public DeviceBasicDto create(DeviceRequestDto dto) {
        Device savedDevice = deviceRepository.save(deviceMapper.toModel(dto));
        return deviceMapper.toBasicDto(savedDevice);
    }

    @Override
    public DeviceBasicDto update(Long id, DeviceRequestDto dto) {
        Device device = deviceRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No device found by id " + id));
        deviceMapper.updateDeviceFromDto(device, dto);
        Device updatedDevice = deviceRepository.save(device);
        return deviceMapper.toBasicDto(updatedDevice);
    }

    @Override
    public void deleteById(Long id) {
        deviceRepository.deleteById(id);
    }
}
