package com.Udemy.SpringCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling For 15 Minutes.";
    }
    
}
