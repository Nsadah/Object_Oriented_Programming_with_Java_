/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nlu.question_2;

import java.util.Scanner;

/**
 *
 * @author micheal
 */
public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt librarian for book description
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        // Normalize the description to lower case for case-insensitive search
        String lowerDescription = description.toLowerCase();

        // Word we want to count, in lower case
        String targetWord = "uganda";

        int count = 0;
        int index = 0;

        // Search for all occurrences of "uganda"
        while ((index = lowerDescription.indexOf(targetWord, index)) != -1) {
            count++;
            index += targetWord.length(); // Move index forward to continue searching
        }

        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
        
        scanner.close();
    }
}