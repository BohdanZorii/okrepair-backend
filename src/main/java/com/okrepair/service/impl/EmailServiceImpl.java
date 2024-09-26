package com.okrepair.service.impl;

import com.okrepair.dto.emailrequest.EmailRequestDto;
import com.okrepair.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    @Value("${spring.mail.username}")
    private String adminEmail;

    private final JavaMailSender mailSender;

    @Override
    public void sendEmailToAdmin(EmailRequestDto emailRequestDto) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(adminEmail);
        mailMessage.setSubject("New Message from User: " + emailRequestDto.userEmail());
        mailMessage.setText(emailRequestDto.message());
        mailSender.send(mailMessage);
    }
}
