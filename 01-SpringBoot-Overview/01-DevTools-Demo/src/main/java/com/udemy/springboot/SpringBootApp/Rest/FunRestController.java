package com.udemy.springboot.SpringBootApp.Rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting Property

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String showTeamInfo()
    {
        return "Coach Name : " + coachName + "\n" + "Team Name : " + teamName;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return "Hi Folks!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Do Workout";
    }

    @GetMapping("/fortune")
    public String getDailyFortune()
    {
        return "Daily Fortune";
    }




}
