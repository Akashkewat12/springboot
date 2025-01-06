package com.codingshuttle.akash.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication  implements CommandLineRunner {

	@Autowired
	Apple  obj;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

//		obj.eatApple();
		System.out.println("you");
		System.out.println("hello");
		System.out.println("A");
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}
