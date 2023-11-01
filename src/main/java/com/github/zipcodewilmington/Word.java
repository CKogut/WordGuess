package com.github.zipcodewilmington;

import java.util.Random;

public class Word {

    public static String getWord (){
        String[] words = {"cat", "dog", "rabbit", "mouse"};
        Random rand = new Random();
        int i = rand.nextInt(4);
        return words[i];
    }

    public static String setDisplay(String word){
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i<word.length(); i++){
            answer.append("_");
        }
        return answer.toString();
    }
}
