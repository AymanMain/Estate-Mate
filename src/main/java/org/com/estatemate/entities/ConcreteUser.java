package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class ConcreteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    private String username;
    private String password;
    // Other user details

    @OneToMany(mappedBy = "owner")
    private List<Property> properties;

    @OneToMany(mappedBy = "applicant")
    private List<Application> applications;

    // Getters and setters
}