package com.springboot.wfrp4e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Wfrp4eApplication {

	public static void main(String[] args) {

		SpringApplication.run(Wfrp4eApplication.class, args);

		System.out.println("Would you like to roll for for d100 or d10s?");

		RollDice rollDice = new RollDice();
		rollDice.rollD10();

	}

}
