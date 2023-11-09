package com.Udemy.SpringCoreDemo.Config;

import com.Udemy.SpringCoreDemo.Common.Coach;
import com.Udemy.SpringCoreDemo.Common.SwimmingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("Aquatic")
    public Coach SwimmingCoach()
    {
        return new SwimmingCoach();
    }

}
