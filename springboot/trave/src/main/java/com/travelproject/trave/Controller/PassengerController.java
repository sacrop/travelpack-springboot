package com.travelproject.trave.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelproject.trave.Model.Passenger;
import com.travelproject.trave.Service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
    private PassengerService passengerService;
    public PassengerController(PassengerService passengerService){
        this.passengerService=passengerService;
    }
      // Endpoint to get passengers
    @GetMapping
    public List<Passenger> getPassengers() {
        // Logic to retrieve passengers
        return passengerService.getPassengers();
    }
}
