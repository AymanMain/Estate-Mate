package org.com.estatemate.controllers;


import org.com.estatemate.entities.Agent;
import org.com.estatemate.entities.Application;
import org.com.estatemate.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/agents")
    public List<Agent> getAllAgents() {
        return adminService.getAllAgents();
    }

    @PostMapping("/agents")
    public Agent addAgent(@RequestBody Agent agent) {
        return adminService.addAgent(agent);
    }

    @PutMapping("/agents/{id}")
    public Agent updateAgent(@PathVariable Long id, @RequestBody Agent agent) {
        return adminService.updateAgent(id, agent);
    }

    @DeleteMapping("/agents/{id}")
    public void deleteAgent(@PathVariable Long id) {
        adminService.deleteAgent(id);
    }

    @GetMapping("/applications")
    public List<Application> getAllApplications() {
        return adminService.getAllApplications();
    }

    // Other endpoint methods
}

