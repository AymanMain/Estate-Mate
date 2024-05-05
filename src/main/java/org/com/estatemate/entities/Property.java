package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private double price;
    private int bedrooms;
    private int bathrooms;
    private double areaSize;
    private String description;
    // Other relevant property details

    @ManyToOne
    private ConcreteUser owner;

    @ElementCollection
    private List<String> imageUrls = new ArrayList<>();

    // Getters and setters
}
