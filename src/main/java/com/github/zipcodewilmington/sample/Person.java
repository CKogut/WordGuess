package com.github.zipcodewilmington.sample;

public class Person {
    public static class TargetWord {

        String[] wordList = {"cat", "dog", "rabbit", "mouse"};

        public static String getTarget(String[] array){
            int random = (int) Math.floor(Math.random());
            return array[random];
        }


    }
}