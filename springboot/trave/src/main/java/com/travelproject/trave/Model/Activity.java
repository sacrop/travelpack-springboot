package com.travelproject.trave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Activity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actId;
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int signedUpCount;
    @ManyToOne
    @JoinColumn(name = "pass_id") // Assuming the foreign key column in the Activity table is named 'pass_id'
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name = "dest_id") // Assuming the foreign key column in the Activity table is named 'dest_id'
    private Destination destination;
}
