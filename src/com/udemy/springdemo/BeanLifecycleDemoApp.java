package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) throws Exception {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // retrieve the bean from spring conf
        TrackCoach coach = context.getBean("myCoach", TrackCoach.class);

        System.out.println(coach.getDailyFortune());

        coach.destroy();

        context.close();

    }
}
