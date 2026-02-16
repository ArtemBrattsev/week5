/**
 * Assignment 4: Vowel or Consonant Checker
 * 
 * COP2250 Java Programming
 * Kevin Pyatt, Ph.D. | Pyatt Labs
 * 
 * Write a program that prompts the user to enter a letter
 * and checks whether it is a vowel or consonant.
 * For non-letter input, display "invalid input".
 */

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        // ACT 1: SET THE STAGE
        Scanner input = new Scanner(System.in);
        
        // ACT 2: GET USER INPUT
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        
        // ACT 3: VALIDATE INPUT
        if (Character.isLetter(ch)) {
            
            // ACT 4: CHECK VOWEL OR CONSONANT
            char lower = Character.toLowerCase(ch);
            
            if (lower == 'a' || lower == 'e' || lower == 'i' 
                || lower == 'o' || lower == 'u') {
                
                System.out.println(ch + " is a vowel");
                
            } else {
                
                System.out.println(ch + " is a consonant");
            }
            
        } else {
            
            System.out.println(ch + " is invalid input");
        }
        
        input.close();
    }
}
