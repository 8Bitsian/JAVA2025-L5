// Part 5 of Project
import java.util.Scanner;

public class J105_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;

        while (true) {
            System.out.print("palindrome? ");
            s = input.nextLine();

            if (s.equals("0")) {
                System.out.println("Thank you.");
                System.out.println("=======================================================");
                break;
            }

            // Remove punctuation but keep spaces, then convert to lowercase
            String cleaned = s.replaceAll("[^a-zA-Z ]", "").toLowerCase();
            String noSpaces = cleaned.replaceAll(" ", "");

            boolean isPalindrome = true;
            int low = 0;
            int high = noSpaces.length() - 1;

            while (low < high) {
                if (noSpaces.charAt(low) != noSpaces.charAt(high)) {
                    isPalindrome = false;
                    break;
                }
                low++;
                high--;
            }

            if (isPalindrome) {
                System.out.println("Yes");
                System.out.println(s.replaceAll("[^a-zA-Z ]", "") + " : " + cleaned);
            } else {
                System.out.println("No");
            }
            System.out.println("=======================================================");
        }
    }
}
