package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }


    //init stuff
    @PostConstruct
    public void doSomeWork() {
        System.out.println( "POST START WORK" + getClass().getSimpleName());
    }

    //distroy
    @PreDestroy
    public void doSomeCleaningBeforeDestroy() {
        System.out.println("PRE DISTROY doSomeCleaningBeforeDestroy" + getClass().getSimpleName());
    }

    @Override
    public String getWorkOutDaily() {
        return "CricketCoach  ";
    }
}
