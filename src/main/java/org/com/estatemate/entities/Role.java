package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Setter
@Getter
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserRole name; // Use a more descriptive field name like "name"

    // Getters and Setters (omitted for brevity)

    public enum UserRole {
        LANDLORD,
        APPLICANT,
        ADMIN // Add other roles as needed
    }
}
