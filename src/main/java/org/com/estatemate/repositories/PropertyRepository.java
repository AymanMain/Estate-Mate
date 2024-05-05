package org.com.estatemate.repositories;

import org.com.estatemate.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    // You can add custom query methods here if needed
}
