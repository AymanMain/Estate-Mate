package org.com.estatemate.services;

import java.util.List;

import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Property;
import org.com.estatemate.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application submitApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application findApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public List<Application> getApplicationsByProperty(Long propertyId) {
        return applicationRepository.findAllByProperty_Id(propertyId);
    }

    public List<Application> getApplicationsByPropertyAndStatus(Long propertyId, Application.ApplicationStatus status) {
        return applicationRepository.findByPropertyAndStatus(propertyId, status); // Custom query
    }

    public void updateApplication(Application application) {
        applicationRepository.save(application);
    }
}
