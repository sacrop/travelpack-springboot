package com.travelproject.trave.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travelproject.trave.Model.Activity;
import com.travelproject.trave.Repository.ActivityRepo;

@Service
public class ActivityService {
    private ActivityRepo activityRepo;


    public ActivityService(ActivityRepo activityRepo){
        this.activityRepo=activityRepo;
    }

    public List<Activity> getAvailableActivities(){
        return activityRepo.findAll();
    }
}
