package com.Udemy.SpringCoreDemo.Rest;

import com.Udemy.SpringCoreDemo.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {



    private Coach myCoach;
    private Coach anotherCoach;

    // First letter of class should be in lower case.
    // Even if the name of class starts with Capital Letter.

    @Autowired
    public DemoRestController(
            @Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach otherCoach)
    {
        System.out.println("In Constructor " + getClass().getSimpleName());
        myCoach = coach;
        anotherCoach = otherCoach;
    }


    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String compareCoaches()
    {
        return "Coach = Another Coach : " + (myCoach == anotherCoach);
    }

}
