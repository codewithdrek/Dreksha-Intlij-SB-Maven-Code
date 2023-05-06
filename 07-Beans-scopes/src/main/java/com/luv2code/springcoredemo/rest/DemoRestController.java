package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoachBean1;

    private Coach mycoachBean2;
   @Autowired
   void doSomeStuff(@Qualifier("baseBallCoach") Coach coach1,
                    @Qualifier("baseBallCoach") Coach coach2) {

       //even if cricketCoach is annotated @lAzy and i am calling it with deliberately hence called
       System.out.println("In Constructor: "+getClass().getSimpleName());
       this.mycoachBean1 = coach1;
       this.mycoachBean2 = coach2;



   }
    @GetMapping("/check")
    public String compareBean() {
        return  "comparing Bean mycoachBean1 == mycoachBean2 " + (mycoachBean1 == mycoachBean2);


    }


    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoachBean1.getWorkOutDaily();
    }


}
