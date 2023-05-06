package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoach;


    //Const for DI
    @Autowired //for one const not needed @

    void doSomeStuff(Coach coach) {
        this.mycoach = coach;
    }
 /*   void setCoach(Coach coach){
       this.mycoach=coach;
    }*/

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoach.getWorkOutDaily();
    }


}
