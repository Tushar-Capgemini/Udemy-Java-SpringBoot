package com.Udemy.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    @Autowired
    public DemoRestController(Coach coach)
    {
        myCoach = coach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

}
