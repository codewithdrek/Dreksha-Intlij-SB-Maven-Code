package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BaseBallCoach implements Coach{


    @Override
    public String getWorkOutDaily() {
        return "BaseBall Coach";
    }
}
