package com.okrepair.controller;

import com.okrepair.dto.device.DeviceBasicDto;
import com.okrepair.dto.device.DeviceDetailsDto;
import com.okrepair.service.DeviceService;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices")
@Validated
@RequiredArgsConstructor
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping
    public Page<DeviceBasicDto> findAll(Pageable pageable) {
        return deviceService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public DeviceDetailsDto findById(@PathVariable @Positive Long id) {
        return deviceService.findById(id);
    }
}
