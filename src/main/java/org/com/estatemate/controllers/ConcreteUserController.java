package org.com.estatemate.controllers;

import org.com.estatemate.entities.ConcreteUser;
import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Property;
import org.com.estatemate.services.ConcreteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ConcreteUserController {

    private final ConcreteUserService concreteUserService;

    @Autowired
    public ConcreteUserController(ConcreteUserService concreteUserService) {
        this.concreteUserService = concreteUserService;
    }

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "User Dashboard";
    }

    @GetMapping("/properties")
    public List<Property> getAllProperties() {
        return concreteUserService.getAllProperties();
    }

    @PostMapping("/properties/{id}/applications")
    public Application submitApplication(@PathVariable Long id, @RequestBody Application application) {
        return concreteUserService.submitApplication(id, application);
    }

    @GetMapping("/applications")
    public List<Application> getUserApplications() {
        return concreteUserService.getUserApplications();
    }

    // Other endpoint methods
}
