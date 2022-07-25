package com.udemy.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService aFortuneService){
        fortuneService = aFortuneService;
    }

    public TrackCoach(){
    }
    @Override
    public String getDailyWorkout() {
        return "daily track workout";
    }

    @Override
    public String getDailyFortune() {
        return "Just track it! " + fortuneService.getFortune();
    }

    // add init method
    public void doStartupStuff(){
        System.out.println("TrackCoach: doing startup stuff");

    }
    // add destroy method
    public void doDestroyStuff(){
        System.out.println("TrackCoach: doing destroy stuff on singleton");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: doing destroy stuff on prototype");
    }
}
