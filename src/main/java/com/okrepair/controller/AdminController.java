package com.okrepair.controller;

import com.okrepair.dto.device.DeviceBasicDto;
import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.service.DeviceService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Validated
@RequiredArgsConstructor
public class AdminController {
    private final DeviceService deviceService;

    @PostMapping("/devices")
    public DeviceBasicDto create(@RequestBody @Valid DeviceRequestDto requestDto) {
        return deviceService.create(requestDto);
    }

    @PutMapping("/devices/{id}")
    public DeviceBasicDto update(@PathVariable @Positive Long id,
                                 @RequestBody @Valid DeviceRequestDto requestDto) {
        return deviceService.update(id, requestDto);
    }

    @DeleteMapping("/devices/{id}")
    public void deleteById(@PathVariable @Positive Long id) {
        deviceService.deleteById(id);
    }
}
