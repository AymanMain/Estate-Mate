package org.com.estatemate.repositories;

import org.com.estatemate.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // You can add custom query methods here if needed
}
