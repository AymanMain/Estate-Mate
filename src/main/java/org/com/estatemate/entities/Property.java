package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Location Information
    private String address;
    private String city;
    private String state;
    private String zipCode;
    @Enumerated(EnumType.STRING)
    private PropertyType type; // Single Family Home, Apartment, Condo, etc.

    // Property Details
    private int yearBuilt;
    private double squareFootage;
    private int bedrooms;
    private int bathrooms;
    @Enumerated(EnumType.STRING)
    private PropertyCondition condition; // Excellent, Good, Fair, Poor

    // Amenities (can be expanded upon)
    private boolean hasGarage;
    private int numberOfParkingSpaces;
    private boolean hasPool;

    private boolean hasYard;

    // Descriptive Information
    private String description;

    // Additional Attributes Affecting Value (consider adding more)
    private String schoolDistrict; // Can be a separate entity later

    @ManyToOne
    private User landlord; // Optional: Many properties can belong to one User (landlord)

    // Getters and Setters (omitted for brevity)

    public enum PropertyType {
        SINGLE_FAMILY_HOME,
        APARTMENT,
        CONDO,
        TOWNHOUSE,
        LAND,
        COMMERCIAL,
        OTHER
    }

    public enum PropertyCondition {
        EXCELLENT,
        GOOD,
        FAIR,
        POOR
    }
}
