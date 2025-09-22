// Part 4 of Lab Project
import java.util.Scanner;                     //Import the Scanner class for user input

public class J105_4 {                         // Define class J105_4
  public static void main(String[] args) {    // Define main Method
    Scanner input = new Scanner(System.in);   // Create Scanner object for input
    System.out.print("Principal ($)? ");      // Prompt the user for input
    double principal = input.nextDouble();    // Read a double from user input
    
    double currentAmount = principal;         // Declare variables
    
    int month = 0;                            // (count = initial value;)
    while (currentAmount > principal / 2) {
      month++;
      double spent = currentAmount * 0.05;
      currentAmount -= spent;
      System.out.printf("After %d month%s: You have $%,.2f = $%,.2f (1-5%%)%n",
                         month, (month > 1 ? "s" : ""), currentAmount, spent);
    }

    System.out.println("=============================================");
    System.out.printf("Your principal will be halved in %d month%s%n",
                       month, (month > 1 ? "s" : ""));     
  }
}
