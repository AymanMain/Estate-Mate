package org.com.estatemate.services;

import java.util.List;

import org.com.estatemate.entities.Application;
import org.com.estatemate.entities.Property;
import org.com.estatemate.entities.ConcreteUser;
import org.com.estatemate.repositories.ConcreteUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcreteUserService {

    @Autowired
    private ConcreteUserRepository ConcreteUserRepository;

    public ConcreteUser registerUser(ConcreteUser newUser) {
        return ConcreteUserRepository.save(newUser);
    }

    public ConcreteUser findUserById(Long id) {
        return ConcreteUserRepository.findById(id).orElse(null);
    }

    public ConcreteUser findUserByEmail(String email) {
        return ConcreteUserRepository.findByEmail(email);
    }

    public List<ConcreteUser> getAllUsers() {
        return ConcreteUserRepository.findAll();
    }

    public ConcreteUser updateUser(ConcreteUser user) {
        return ConcreteUserRepository.save(user);
    }

    public void deleteUser(Long id) {
        ConcreteUserRepository.deleteById(id);
    }

    public List<Property> getAllProperties() {
        return List.of();
    }

    public Application submitApplication(Long id, Application application) {
            return null;
    }

    public List<Application> getUserApplications() {
            return null;
    }
}
