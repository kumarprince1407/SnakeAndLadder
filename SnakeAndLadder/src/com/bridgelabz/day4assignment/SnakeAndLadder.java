package com.bridgelabz.day4assignment;

import java.util.*;

public class SnakeAndLadder {
    public static void main(String args[]){
        Random random = new Random();
        System.out.println("Welcome to the Snake and Ladder game!");
        int start=0;
        int p1Position=start;
        System.out.println("The player P1 has started from the position - "+p1Position);
        int rollp1=start;
        rollp1=random.nextInt(6);
        System.out.println("Player 1 got "+rollp1+" on his first roll.");
    }
}
/*
The Player rolls the die
to get a number
between 1 to 6. - Use ((RANDOM)) to get the number between 1 and 6
* */
