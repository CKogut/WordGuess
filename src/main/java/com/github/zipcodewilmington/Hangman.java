package com.github.zipcodewilmington;

import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Set the word to guess
        String targetWord = "Guess";

        //Explain the game
        System.out.println("Can you guess what word I'm thinking?");
        System.out.println("You have " + targetWord.length() + " tries!");


        //While guessesRemain and !answered, ask for a letter
            System.out.println("Enter a letter: ");

            //Compare input to targetWord. If matches, show it to user hangman style.
            //Ask for next guess

        //if answered, show full word and tell them they won
        //if out of guess, tell them they lost




    }
}
