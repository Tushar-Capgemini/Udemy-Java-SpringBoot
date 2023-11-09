package com.Udemy.SpringCoreDemo.Common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{

    public BasketBallCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 Minutes In Dribbling!";
    }
}
