package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

       public CricketCoach(){
           System.out.println("In Constructor: "+getClass().getSimpleName());
       }
    @Override
    public String getWorkOutDaily() {
        return "CricketCoach  ";
    }
}
