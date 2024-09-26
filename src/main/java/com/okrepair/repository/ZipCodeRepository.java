package com.okrepair.repository;

import com.okrepair.model.ZipCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, String> {
}
