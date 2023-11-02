package com.github.zipcodewilmington;

import java.util.Arrays;
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
        char [] word = Word.getWord();
        //Create attempt string
        char [] attempt = Word.setDisplay(word);

        boolean correct = false;
        int tries = word.length;

        //Intro the game
        System.out.println("Can you guess what word I'm thinking?");


        //While guessesRemain and !correct, ask for a letter
        while (!correct && tries > 0) {
            //Print attempt array here, starts as ____
            System.out.println("You have " + tries + " tries left!");
            System.out.println(attempt);
            System.out.println("Enter a letter: ");
            char guess = scan.next().charAt(0);

            //check for exit
            if (guess == '-'){ break;}



            //Compare input to targetWord. If matches, show it to user hangman style.
            //Ask for next guess
            for (int i=0; i < word.length; i++){
                if (guess == word[i]) {
                    attempt[i] = guess;
                }
            }

            //check to see if word has been guessed
            if (Arrays.equals(attempt, word)){
                String printedWord = new String(word);
                System.out.println("You guessed \'" + printedWord + "\'! You won!");
                correct = true;
            }

            tries--;

        }

        //if out of guess, tell them they lost
        if (!correct){
            System.out.println("You lost!");
        }



    }
}
