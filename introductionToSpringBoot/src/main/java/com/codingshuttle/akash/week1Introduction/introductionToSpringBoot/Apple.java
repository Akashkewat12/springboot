package com.codingshuttle.akash.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    void eatApple() {

        System.out.println("I am eating the apple.");
    }

    @PostConstruct
    void callTisBeforeAppleUsed() {
        System.out.println("Creating the apple before used");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroyed the apple before used");
    }
}
