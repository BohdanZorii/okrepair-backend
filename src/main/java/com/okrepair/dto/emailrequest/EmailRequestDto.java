package com.okrepair.dto.emailrequest;

public record EmailRequestDto(
        String userEmail,
        String message
) {
}
