package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }


    @Override
    public String getWorkOutDaily() {
        return "BaseBall Coach";
    }
}
