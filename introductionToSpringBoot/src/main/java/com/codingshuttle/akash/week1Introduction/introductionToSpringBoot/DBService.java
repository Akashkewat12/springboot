package com.codingshuttle.akash.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private DB db;
      String getData() {
       return db.getData();
      }
}