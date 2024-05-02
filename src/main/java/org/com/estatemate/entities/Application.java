package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import javax.persistence.Column; // For additional field configuration
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Setter
@Getter
@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Application Details
    private String message; // Optional message from applicant
    private LocalDate applicationDate = LocalDate.now(); // Date application was submitted

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status; // PENDING, APPROVED, REJECTED

    // Relationships
    @ManyToOne
    private User applicant; // The User applying for the property

    @ManyToOne
    private Property property; // The Property the application is submitted for

    // Getters and Setters (omitted for brevity)

    public enum ApplicationStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
}
