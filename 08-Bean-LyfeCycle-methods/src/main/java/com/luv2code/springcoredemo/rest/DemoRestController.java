package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoachBean1;

   @Autowired
   void doSomeStuff(@Qualifier("cricketCoach") Coach coach1) {

       //even if cricketCoach is annotated @lAzy and i am calling it with deliberately hence called
       System.out.println("In Constructor: "+getClass().getSimpleName());
       this.mycoachBean1 = coach1;

   }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoachBean1.getWorkOutDaily();
    }


}
