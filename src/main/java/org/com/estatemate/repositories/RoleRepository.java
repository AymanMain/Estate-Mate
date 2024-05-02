package org.com.estatemate.repositories;

import org.com.estatemate.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Add custom queries here if needed (optional)
}
