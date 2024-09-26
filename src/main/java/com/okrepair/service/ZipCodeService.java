package com.okrepair.service;

import com.okrepair.dto.zipcode.ZipCodeDto;
import java.util.List;

public interface ZipCodeService {
    List<ZipCodeDto> findAll();

    ZipCodeDto create(ZipCodeDto zipCode);

    void delete(ZipCodeDto zipCodeDto);
}
