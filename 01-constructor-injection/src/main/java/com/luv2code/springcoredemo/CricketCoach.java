package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getWorkOutDaily() {
        return "Practice fast boiling for 15 min !!!!!! ";
    }
}
