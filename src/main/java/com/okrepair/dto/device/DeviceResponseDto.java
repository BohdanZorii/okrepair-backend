package com.okrepair.dto.device;

public record DeviceResponseDto(
        Long id,
        String name,
        String imageUrl,
        String description
) {
}
