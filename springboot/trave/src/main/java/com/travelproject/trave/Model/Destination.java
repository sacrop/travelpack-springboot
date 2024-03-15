package com.travelproject.trave.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int destId;
    private String name;
    @OneToMany(mappedBy = "destination")
    private List<Activity> activities;
    
    @ManyToOne
    @JoinColumn(name = "travel_id") // Assuming the foreign key column in the Destination table is named 'travel_id'
    private TravelPackage travelPackage;
}
