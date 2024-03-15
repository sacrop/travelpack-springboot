package com.travelproject.trave.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelproject.trave.Model.Destination;
import com.travelproject.trave.Service.DestinationService;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
    private DestinationService destinationService;

    public DestinationController(DestinationService destinationService){
        this.destinationService=destinationService;
    }
    
    @GetMapping
    public List<Destination> getDestinations() {
        // Logic to retrieve destinations
        return destinationService.getDestinations();
    }
}
