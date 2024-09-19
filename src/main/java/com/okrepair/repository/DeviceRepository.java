package com.okrepair.repository;

import com.okrepair.model.Device;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    Page<Device> findAll(Pageable pageable);

    @EntityGraph(attributePaths = "deviceSubtypes")
    Optional<Device> findById(Long id);
}
