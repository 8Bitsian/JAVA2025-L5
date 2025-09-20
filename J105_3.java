// Part 3 of Lab Project
import java.util.Scanner;                     //Import the Scanner class for user input
import java.util.Random;                      //Import the Random class for generating secretNum

public class J105_3 {                         // Define class J105_3
  public static void main(String[] args) {    // Define main Method
    Scanner input = new Scanner(System.in);   // Create Scanner object for input
    Random random = new Random();             // Create Random object for secretNum

    //Section A: Do-While Loop
    int secretNum = random.nextInt(100) + 1;  // Generate a random number between 1 and 100 (inclusive)
    int guess;                                // Store user's guess (count = initial value;)
    
    do {
      System.out.print("? ");                 // Prompt the user for input
      guess = input.nextInt();                // Read an integer from user input
    } while (guess != secretNum);             // Loop continues if guess does not equal secretNum (count < endValue;)

    System.out.println("Yes!");               // Print when loop terminates
  }
}
