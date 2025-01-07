package com.codingshuttle.akash.week1Introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DevDb implements DB {
    public String getData() {
     return "DevDB";
    }
}
