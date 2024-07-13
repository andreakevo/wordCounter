package com.company;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text");
        String input = scanner.nextLine();
        input = input.trim();
        int counter = 0;
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank()) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
