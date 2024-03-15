package com.travelproject.trave.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travelproject.trave.Model.Destination;
import com.travelproject.trave.Repository.DestinationRepo;

@Service
public class DestinationService {
    private DestinationRepo DestinationRepo;

    public DestinationService(DestinationRepo destinationRepo){
        this.DestinationRepo=destinationRepo;
    }
    public List<Destination> getDestinations(){
        return DestinationRepo.findAll();
    }
    
}
