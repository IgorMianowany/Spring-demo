package com.udemy.springdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService{

    private ArrayList<String> fortuneList = new ArrayList<>(){
        {
            add("fresh");
            add("not fresh");
            add("super fresh");
        }
    };

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortuneList.get(random.nextInt(0,3));
    }
}
