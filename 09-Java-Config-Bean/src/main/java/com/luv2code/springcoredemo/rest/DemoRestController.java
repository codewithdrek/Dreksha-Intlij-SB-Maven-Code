package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach mycoachBean;

   @Autowired
   void doSomeStuff(@Qualifier("getSwimCoach") Coach coach) {

       //even if cricketCoach is annotated @lAzy and i am calling it with deliberately hence called
      // System.out.println("In Constructor: "+getClass().getSimpleName());
       this.mycoachBean = coach;
       mycoachBean.getWorkOutDaily();

   }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout()
    {
        return mycoachBean.getWorkOutDaily();
    }


}


//if no annotation @Component in SwimCoach class then bean "swimCoach " won't come
//Alternate solution here is crete new Package Config put @Configuration over class and make one method ehich return New SwimCoach() make sure method name and @Qualifier nmust be same
//one more this put @bean over it