package com.Udemy.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Spend 25 Minutes In Tennis Shot Practice!";
    }
}
