package com.Udemy.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling For 25 Minutes.";
    }
    
}
