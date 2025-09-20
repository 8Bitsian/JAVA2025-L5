// Alternative Interview Question for Lab 5

public class AltLab5 {
  public static void main(String[] args) {
    final double PI = 3.141592653589793;  // Declare a constant PI w/value up to 15 decimal places
    
    //Section A For Loop from 0-15 to display PI
    for (int i = 0; i <= 15; ++i) {       // i = initial value; i < endValue; i++;
      System.out.printf("Pi (" + i + "): %." + i + "f\n", PI);
    }
  }
}
