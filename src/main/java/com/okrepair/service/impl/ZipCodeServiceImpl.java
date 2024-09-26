package com.okrepair.service.impl;

import com.okrepair.dto.zipcode.ZipCodeDto;
import com.okrepair.model.ZipCode;
import com.okrepair.repository.ZipCodeRepository;
import com.okrepair.service.ZipCodeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZipCodeServiceImpl implements ZipCodeService {
    private final ZipCodeRepository zipCodeRepository;

    @Override
    public List<ZipCodeDto> findAll() {
        return zipCodeRepository.findAll().stream()
                .map(zipCode -> new ZipCodeDto(zipCode.getCode()))
                .toList();
    }

    @Override
    public ZipCodeDto create(ZipCodeDto dto) {
        ZipCode savedZipCode = zipCodeRepository.save(new ZipCode(dto.zipCode()));
        return new ZipCodeDto(savedZipCode.getCode());
    }

    @Override
    public void delete(ZipCodeDto dto) {
        zipCodeRepository.deleteById(dto.zipCode());
    }
}
