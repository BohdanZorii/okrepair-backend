package com.okrepair.service;

import com.okrepair.dto.textus.EmailRequestDto;

public interface EmailService {
    void sendEmailToAdmin(EmailRequestDto emailRequestDto);
}
