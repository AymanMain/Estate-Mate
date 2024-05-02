package org.com.estatemate.repositories;

import org.com.estatemate.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    // Add custom queries here if needed (optional)

    // Example custom query to find properties by city (optional)
    List<Property> findByCity(String city);
}
