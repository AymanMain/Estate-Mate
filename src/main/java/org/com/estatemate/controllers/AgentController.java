package org.com.estatemate.controllers;

import org.com.estatemate.entities.Agent;
import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Property;
import org.com.estatemate.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    private final AgentService agentService;

    @Autowired
    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/dashboard")
    public String agentDashboard() {
        return "Agent Dashboard";
    }

    @GetMapping("/properties")
    public List<Property> getAgentProperties() {
        return agentService.getAgentProperties();
    }

    @GetMapping("/applications")
    public List<Application> getAgentApplications() {
        return agentService.getAgentApplications();
    }

    @PutMapping("/applications/{id}")
    public Application updateApplicationStatus(@PathVariable Long id, @RequestBody Application application) {
        return agentService.updateApplicationStatus(id, application.getStatus());
    }

    // Other endpoint methods
}
