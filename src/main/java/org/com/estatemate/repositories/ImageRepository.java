package org.com.estatemate.repositories;

import java.util.List;

import org.com.estatemate.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

    // Add custom queries here if needed (optional)

    // Find images by property (using convention for foreign key relationship)
    List<Image> findByProperty_Id(Long propertyId);
}
