package org.com.estatemate.repositories;

import org.com.estatemate.entities.ConcreteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcreteUserRepository extends JpaRepository<ConcreteUser, Long> {
    ConcreteUser findByEmail(String email);
    // You can add custom query methods here if needed
}