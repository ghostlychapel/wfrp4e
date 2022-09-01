package com.springboot.wfrp4e;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class RollDice {

    public List rollD10() {

        System.out.println("How many dice would you like to roll?");

        int userDiceChoice;
        List<Integer> diceRollList = new ArrayList<>();

        Scanner userInputValue = new Scanner(System.in);
        userDiceChoice = userInputValue.nextInt();
        int diceRollListTotal = 0;
        for (int d = 1; d <= userDiceChoice; d++) {
            int x = random1to10();
            diceRollList.add(x);
            diceRollListTotal += x;
        }

        System.out.println("Your dice roll total is " + diceRollListTotal + "\nYour dice rolls were as follows: \n" + diceRollList);

        return diceRollList;
    }

    public int rollD100() {

        int diceRoll10s = (random1to10()*10);
        int diceRoll1s = random1to10();
        int diceRoll100 = Math.addExact(diceRoll10s, diceRoll1s);
        System.out.println("Your roll for d100 is " + diceRoll100 + "\nYour dice rolls were as follows: \n" + "The 10's die rolled for " + diceRoll10s + ". And the 1's die rolled for " + diceRoll1s);

        return diceRoll100;
    }

    private int random1to10() {

        int diceRoll = (int) (Math.floor(Math.random() * 10) +1);

        return diceRoll;
    }

}