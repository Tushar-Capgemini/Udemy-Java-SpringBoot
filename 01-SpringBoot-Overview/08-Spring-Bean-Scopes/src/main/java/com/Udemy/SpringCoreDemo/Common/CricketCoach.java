package com.Udemy.SpringCoreDemo.Common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// New Object Is Created During Each Injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling For 25 Minutes.";
    }
    
}
