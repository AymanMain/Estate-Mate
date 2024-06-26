package org.com.estatemate.repositories;

import org.com.estatemate.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // You can add custom query methods here if needed
}
