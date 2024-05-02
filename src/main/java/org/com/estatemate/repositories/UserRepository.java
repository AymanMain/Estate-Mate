package org.com.estatemate.repositories;

import org.com.estatemate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom queries here if needed (optional)

    // Example custom query to find users by email (optional)
    User findByEmail(String email);
}
