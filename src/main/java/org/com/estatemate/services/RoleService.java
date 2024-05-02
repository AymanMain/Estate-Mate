package org.com.estatemate.services;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.com.estatemate.entities.Role;
import org.com.estatemate.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role findRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }


    // Option 2: Using Spring Data JPA finder method (if applicable)
    public Role findRoleByName(String name) {
        // Assuming a "name" property exists in the Role entity
        return roleRepository.findByName(name); // Spring Data JPA finder method
    }
}
