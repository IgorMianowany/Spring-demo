package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        VolleyballCoach coach = context.getBean("myVolleyballCoach", VolleyballCoach.class);

        System.out.println( "email: " + coach.getEmail() + "\nteam name: " + coach.getTeam());

        context.close();

    }
}
