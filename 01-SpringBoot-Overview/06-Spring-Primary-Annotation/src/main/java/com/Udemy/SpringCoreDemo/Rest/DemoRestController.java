package com.Udemy.SpringCoreDemo.Rest;

import com.Udemy.SpringCoreDemo.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    // First letter of class should be in lower case.
    // Even if the name of class starts with Capital Letter.

    @Autowired
    public DemoRestController(Coach coach)
    {
        myCoach = coach;
    }

//    @Autowired
//    public void setMyCoach(Coach coach)
//    {
//        myCoach = coach;
//    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

}
