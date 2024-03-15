package com.travelproject.trave.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelproject.trave.Model.Destination;
@Repository
public interface DestinationRepo extends JpaRepository<Destination,Integer> {
    
}
