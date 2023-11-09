package com.Udemy.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run A Hard 5000m.";
    }
}
