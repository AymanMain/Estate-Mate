package org.com.estatemate.services;

import java.util.List;

import org.com.estatemate.entities.Property;
import org.com.estatemate.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    public Property findPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    public List<Property> findPropertiesByCity(String city) {
        return propertyRepository.findByCity(city); // Custom query from repository
    }

    public void updateProperty(Property property) {
        propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
