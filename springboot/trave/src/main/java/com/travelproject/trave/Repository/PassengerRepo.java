package com.travelproject.trave.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelproject.trave.Model.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer>{

    
} 