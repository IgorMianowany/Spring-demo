package com.udemy.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService aFortuneService){
        fortuneService = aFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "daily baseball workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
