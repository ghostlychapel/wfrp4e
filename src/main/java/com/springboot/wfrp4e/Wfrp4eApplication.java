package com.springboot.wfrp4e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Wfrp4eApplication {

	public static void main(String[] args) {

		SpringApplication.run(Wfrp4eApplication.class, args);

		System.out.println("Would you like to roll for for d100 or d10s?");

		String userD10orD100;

		Scanner userInputD10orD100 = new Scanner(System.in);
		userD10orD100 = userInputD10orD100.nextLine();

		if (userD10orD100 .equalsIgnoreCase("d10s")) {
			RollDice rollDice = new RollDice();
			rollDice.rollD10();
		}
		else if (userD10orD100 .equalsIgnoreCase("d100")){
			RollDice rollDice = new RollDice();
			rollDice.rollD100();
		}
		else {
			System.out.println("Please type \"d100\" or \"d10s\" ");
		}
	}
}
