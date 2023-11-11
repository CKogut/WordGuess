package com.github.zipcodewilmington;

import java.util.Random;

public class Word {

    public static char[] getWord (){
        String[] words = {"cat", "paper", "rabbit", "mouse"};
        Random rand = new Random();
        int i = rand.nextInt(4);
        return words[i].toCharArray();
    }

    public static char[] setDisplay(char [] word){
        String answer = "";
        for (int i = 0; i<word.length; i++){
            answer = answer + "_";
        }
        return answer.toCharArray();
    }
}
