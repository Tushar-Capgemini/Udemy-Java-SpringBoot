package com.Udemy.SpringCoreDemo.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run A Hard 5000m.";
    }
}
