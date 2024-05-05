package org.com.estatemate.services;

import org.com.estatemate.entities.Admin;
import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Agent;
import org.com.estatemate.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public List<Agent> getAllAgents() {
        return List.of();
    }

    public Agent addAgent(Agent agent) {
        return agent;
    }

    public Agent updateAgent(Long id, Agent agent) {
        return agent;
    }

    public void deleteAgent(Long id) {
    }

    public List<Application> getAllApplications() {
        return null;
    }

    // You can add other service methods as needed
}

