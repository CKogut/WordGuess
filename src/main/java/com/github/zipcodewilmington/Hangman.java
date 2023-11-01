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

        //Set the target word
        String word = Word.getWord();
        //Create attempt string
        String attempt = Word.setDisplay(word);


        boolean correct = false;
        int tries = word.length();

        //Explain the game
        System.out.println("Can you guess what word I'm thinking?");
        System.out.println("You have " + word.length() + " tries!");

        //While guessesRemain and !correct, ask for a letter
        while (!correct && tries > 0) {
            //Print attempt array here, starts as ___*
            System.out.println(attempt);
            System.out.println("Enter a letter: ");
            //char guess = scan.next().charAt(0);

            //Compare input to targetWord. If matches, show it to user hangman style.
            //Ask for next guess


            tries--;
        }



        //if answered, show full word and tell them they won
        //if out of guess, tell them they lost




    }
}
