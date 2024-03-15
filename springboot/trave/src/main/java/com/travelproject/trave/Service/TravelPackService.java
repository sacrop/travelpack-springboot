package com.travelproject.trave.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travelproject.trave.Model.TravelPackage;
import com.travelproject.trave.Repository.TravelPackRepo;

@Service
public class TravelPackService {
    private TravelPackRepo travelPackRepo;
    public TravelPackService(TravelPackRepo travelPackRepo){
        this.travelPackRepo=travelPackRepo;
    }
    public List<TravelPackage> getTravelPackages(){
        return travelPackRepo.findAll();
    }
}
