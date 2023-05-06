package com.luv2code.springcoredemo.common;


//on propose we are not using @Component here
public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In Swim Constructor" +getClass().getSimpleName()
        );
    }

    @Override
    public String getWorkOutDaily() {
        return "WorkOutDaily Swim faster";
    }
}
