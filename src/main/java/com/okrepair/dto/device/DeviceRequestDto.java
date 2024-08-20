package com.okrepair.dto.device;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DeviceRequestDto(
        @NotBlank(message = "Name is mandatory")
        @Size(max = 255, message = "Name must be less than 255 characters")
        String name,
        @Size(max = 255, message = "Image URL must be less than 255 characters")
        String imageUrl,
        @Size(max = 500, message = "Description must be less than 500 characters")
        String description
) {
}

