package com.udemy.springdemo;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public VolleyballCoach() {
        System.out.println("no arg constructor");
    }



    @Override
    public String getDailyWorkout() {
        return "normalnie pileczka 5kg i rzucamy fresh";
    }

    @Override
    public String getDailyFortune() {
        return "Pilka fresh no i " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
