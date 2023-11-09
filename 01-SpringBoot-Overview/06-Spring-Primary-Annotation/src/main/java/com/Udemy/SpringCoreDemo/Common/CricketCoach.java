package com.Udemy.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling For 25 Minutes.";
    }
    
}
