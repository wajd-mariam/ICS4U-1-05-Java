/*
* Copyright (c) 2020
*
* This guessing game program asks the user
* to guess a randomly generated number within a 
* specified range.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/26
*/

// Imports Java Classes:
import java.util.Random;
import java.util.Scanner;

public class DiceRandom {
  /**
   * This function asks the user to eneter a specified range for the random number, 
   * and asks to guess the random generated number.
   */
  public static void main(String[] args) {
    
    // Declaring Variables:
    int counter = 0;
    double number = 0;
    
    // Input/Process/Output
    try {
      // User Input:
      // Range Input
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter the maximum range of the dice:");
      int range = input1.nextInt();
        
      // Random Number Generator:
      final int randomNumber = (int) (Math.random() * (range - 1)) + 1;

      // Do While Loop:
      do {
        // User Input:
        // User Guess
        Scanner input2 = new Scanner(System.in);
        System.out.println("Can you guess random number between 1 and " + range + " ?");
        int numberEntered = input2.nextInt();
        number = numberEntered;

        // Process
        counter = counter + 1;
        // If statements:
        if (numberEntered > randomNumber) {
          System.out.println("You've guessed too high!");
        } else if (numberEntered < randomNumber) {
          System.out.println("You've guessed too low!");
        } else if (numberEntered == randomNumber) {
          System.out.println("You guessed it! It took you " 
                             + counter + " try/tries to get it correctly!");
        }
      } while (randomNumber != number);
      // Output:
    } catch (Exception e) {
      System.out.println();
      System.out.println("An error occurred");
    }
  }
}