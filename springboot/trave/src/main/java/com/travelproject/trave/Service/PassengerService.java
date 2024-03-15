package com.travelproject.trave.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travelproject.trave.Model.Passenger;
import com.travelproject.trave.Repository.PassengerRepo;

@Service
public class PassengerService {
    private PassengerRepo passengerRepo;
    public PassengerService(PassengerRepo passengerRepo){
        this.passengerRepo=passengerRepo;
    }
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }
    
}
