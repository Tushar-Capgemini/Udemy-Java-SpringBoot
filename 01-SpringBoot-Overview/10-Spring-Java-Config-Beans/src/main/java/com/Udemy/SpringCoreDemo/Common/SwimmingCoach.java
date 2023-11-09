package com.Udemy.SpringCoreDemo.Common;

public class SwimmingCoach implements Coach{

    public SwimmingCoach()
    {
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 5 Laps Of The Swimming Pool.";
    }
}
