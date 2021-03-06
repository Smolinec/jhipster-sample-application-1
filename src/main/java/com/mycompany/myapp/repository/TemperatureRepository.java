package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Temperature;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Temperature entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {
}
