package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ConcreteUser applicant;

    @ManyToOne
    private Property property;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private String message;

    private String contractLink;

    private LocalDate contractExpiryDate;

    // Getters and setters
    public enum ApplicationStatus {
        PENDING,
        APPROVED,
        REJECTED
    }

}
