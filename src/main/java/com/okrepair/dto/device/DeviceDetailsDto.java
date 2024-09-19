package com.okrepair.dto.device;

import java.util.List;

public record DeviceDetailsDto(
        Long id,
        String description,
        List<DeviceSubtypeResponseDto> deviceSubtypes
) {
}
