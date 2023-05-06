package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

@Bean //getSwimCoach is same in Controller class @Qualifier ("getSwimCoach")
//for testing you  can run URL(http://localhost:8080/getDailyWorkout) will get message of SWIM CLASS  "WorkOutDaily Swim faster"
  //  public Coach getSwimCoach(){
   public Coach getCustomeSwimCoachBean(){
    return new SwimCoach();
}
}
