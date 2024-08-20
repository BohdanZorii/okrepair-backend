package com.okrepair.controller;

import com.okrepair.dto.device.DeviceRequestDto;
import com.okrepair.dto.device.DeviceResponseDto;
import com.okrepair.service.DeviceService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices")
@Validated
@RequiredArgsConstructor
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping
    public List<DeviceResponseDto> findAll() {
        return deviceService.findAll();
    }

    @GetMapping("/{id}")
    public DeviceResponseDto findById(@PathVariable @Positive Long id) {
        return deviceService.findById(id);
    }

    @PostMapping
    public DeviceResponseDto create(@RequestBody @Valid DeviceRequestDto requestDto) {
        return deviceService.create(requestDto);
    }

    @PutMapping("/{id}")
    public DeviceResponseDto update(@PathVariable @Positive Long id,
                                    @RequestBody @Valid DeviceRequestDto requestDto) {
        return deviceService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable @Positive Long id) {
        deviceService.deleteById(id);
    }
}
