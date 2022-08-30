package com.springboot.wfrp4e;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class RollDice {

    public List rollD10() {

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

    private int random1to10() {

        int diceRoll = (int) (Math.floor(Math.random() * 10) +1);

        //System.out.print(diceRoll);

        return diceRoll;
    }

}