package com.codingshuttle.akash.week1Introduction.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ProdDB implements DB {
    public String getData() {
        return "ProdDB";
    }
}
