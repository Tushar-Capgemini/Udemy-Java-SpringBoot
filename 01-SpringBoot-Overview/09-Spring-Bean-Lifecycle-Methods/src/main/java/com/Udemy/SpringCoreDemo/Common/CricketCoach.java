package com.Udemy.SpringCoreDemo.Common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor " + getClass().getSimpleName());
    }

    // Defining Our Init Method i.e. PostConstruct
    // This will run after creating the bean

    @PostConstruct
    public void doStartupStuff()
    {
        System.out.println("In The Construction Method Of : " + getClass().getSimpleName());
    }

    // Defining Our Destroy Method i.e. PreDestroy
    // This will run before cleaning up the bean

    @PreDestroy
    public void doCleanupStuff()
    {
        System.out.println("In The Destroy Method Of : " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling For 25 Minutes.";
    }
    
}
