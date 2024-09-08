package com.okrepair.repository;

import com.okrepair.model.CustomerDetails;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
    Optional<CustomerDetails> findByEmail(String email);
}
