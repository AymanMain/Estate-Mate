package org.com.estatemate.services;

import org.com.estatemate.entities.Agent;
import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Property;
import org.com.estatemate.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    public Agent getAgentById(Long id) {
        return agentRepository.findById(id).orElse(null);
    }

    public List<Property> getAgentProperties() {
        return List.of();
    }

    public List<Application> getAgentApplications() {
            return null;
    }

    public Application updateApplicationStatus(Long id, Application.ApplicationStatus status) {
        return null;
    }

    // You can add other service methods as needed
}
