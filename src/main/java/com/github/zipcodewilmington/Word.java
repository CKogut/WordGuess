package com.github.zipcodewilmington;

import java.util.Random;

public class Word {

    public static String getWord (){
        String[] words = {"cat", "dog", "rabbit", "mouse"};
        Random rand = new Random();
        int i = rand.nextInt(4);
        return words[i];
    }
}
