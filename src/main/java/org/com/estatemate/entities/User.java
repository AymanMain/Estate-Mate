package org.com.estatemate.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class User {


    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String email;



    // Optional additional details
    @Setter
    @Getter
    private String phoneNumber; // Can be a separate entity later
    @Setter
    @Getter
    private String address;
    @ManyToOne
    private Role role;
    // Getters and Setters (omitted for brevity)


}
