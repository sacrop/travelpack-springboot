package com.travelproject.trave.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int travelId;
    private String name;
    private int passengerCapacity;
    @OneToMany(mappedBy = "travelPackage")
    private List<Destination> itinerary;

    @ManyToMany(mappedBy = "travelPackages")
    private List<Passenger> passengers;
}
