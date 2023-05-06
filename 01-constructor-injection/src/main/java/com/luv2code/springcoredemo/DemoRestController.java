package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoach;


    //Const for DI
    @Autowired //for one const not needed @
    DemoRestController(Coach mycoach){
        this.mycoach=mycoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoach.getWorkOutDaily();
    }


}
