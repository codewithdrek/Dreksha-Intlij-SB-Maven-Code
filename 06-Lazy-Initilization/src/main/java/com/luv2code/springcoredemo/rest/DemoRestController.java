package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoach;

   @Autowired
   void doSomeStuff(@Qualifier("baseBallCoach") Coach coach) {

       //even if cricketCoach is annotated @lAzy and i am calling it with delibratly hensce called
       System.out.println("In Constructor: "+getClass().getSimpleName());
       this.mycoach = coach;
   }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoach.getWorkOutDaily();
    }


}
