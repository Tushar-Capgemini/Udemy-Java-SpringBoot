package com.Udemy.SpringCoreDemo.Rest;

import com.Udemy.SpringCoreDemo.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    // First letter of "Class" should be in Lower Case.
    // Even if the name of "Class" starts with Capital Letter.
    // In case of Bean, Write the exact name or Bean ID of it. (Case Sensitive)

    @Autowired
    public DemoRestController(@Qualifier("Aquatic") Coach coach)
    {
        System.out.println("In Constructor " + getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

}
