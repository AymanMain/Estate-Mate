package org.com.estatemate.repositories;

import org.com.estatemate.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    // You can add custom query methods here if needed
}

