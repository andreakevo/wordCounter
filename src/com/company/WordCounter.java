package com.company;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text");
        String input = scanner.nextLine();
        input = input.trim();
        String[] words = input.split(" ");

        int counter = countingNumberOfTheWords(words);
        System.out.println("Number of the words in your sentence is " + counter);
        String longestWord = getTheLongestWord(words);
        System.out.println(("The longest word in your sentence is " + longestWord));
    }

    public static int countingNumberOfTheWords(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank()) {
                counter++;
            }
        }
        return counter;
    }

    public static String getTheLongestWord(String[] words){
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
