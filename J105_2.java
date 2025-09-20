// Part 2 of Lab Project
public class J105_2 {                         // Define class J105_2
  public static void main(String[] args) {    // Define main Method
    //Section A: For Loops
    for (int j = 0; j <= 9; j++)   { // j = initial value; j < endValue; j++ (Increment);
      System.out.print(" " + j);
    }
    
    System.out.println("\n-----------------------------------------");

    for (int i = 1; i <= 9; i++)   { // i = initial value; i < endValue; i++;
      System.out.print(i + " | ");
      for (int j = 1; j <= 9; j++) { // j = initial value; j < endValue; j++;
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }

    //Section B: While Loops
    int j = 0;                       // j = initial value;
    while (j <= 9) {                 // j < endValue;
      System.out.print(" " + j);
      j++;                           // Increment j
    }

    System.out.println("\n-----------------------------------------");
    
    int i = 1;                       // i = initial value;
    while (i <= 9) {                 // i < endValue;
      System.out.print(i + " | ");
      int j = 1;                     // j = initial value;
        while (j <= 9) {             // j < endValue; {
          System.out.printf("%4d", i * j);
          j++;                       // Increment j
        }
      System.out.println();
      i++;                           // Increment i
    }
  }
}
