package com.travelproject.trave.Model;

import java.util.List;

import com.travelproject.trave.Enums.PassengerType;

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
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passId;
    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private double balance;
    @ManyToMany
    private List<TravelPackage> travelPackages;
    @OneToMany(mappedBy = "passenger")
    private List<Activity> signedActivities;
}
