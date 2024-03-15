package com.travelproject.trave.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelproject.trave.Model.Activity;
import com.travelproject.trave.Service.ActivityService;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private ActivityService activityService;
    public ActivityController(ActivityService activityService){
        this.activityService=activityService;
    }


    @GetMapping("/available")
    public List<Activity> getAvailableActivities() {
        return activityService.getAvailableActivities();
    }
}
