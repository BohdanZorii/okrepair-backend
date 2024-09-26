package com.okrepair.controller;

import com.okrepair.dto.emailrequest.EmailRequestDto;
import com.okrepair.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactController {
    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<String> sendEmailToAdmin(@RequestBody EmailRequestDto emailRequestDto) {
        emailService.sendEmailToAdmin(emailRequestDto);
        return ResponseEntity.ok("Email sent successfully");
    }
}
