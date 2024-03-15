package com.travelproject.trave.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelproject.trave.Model.TravelPackage;
import com.travelproject.trave.Service.TravelPackService;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackController {
    private TravelPackService travelPackService;
    public TravelPackController(TravelPackService travelPackService){
        this.travelPackService=travelPackService;
    }
    // Endpoint to get travel packages
    @GetMapping
    public List<TravelPackage> getTravelPackages() {
        return travelPackService.getTravelPackages();
        // Logic to retrieve travel packages
    }
}
