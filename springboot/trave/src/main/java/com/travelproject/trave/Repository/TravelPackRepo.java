package com.travelproject.trave.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelproject.trave.Model.TravelPackage;
@Repository
public interface TravelPackRepo extends JpaRepository<TravelPackage,Integer>{
    
}
