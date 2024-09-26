package com.okrepair.service;

import com.okrepair.dto.emailrequest.EmailRequestDto;

public interface EmailService {
    void sendEmailToAdmin(EmailRequestDto emailRequestDto);
}
