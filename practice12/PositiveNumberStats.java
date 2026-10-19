package practice12;

import java.util.Scanner;

//Custom User-Defined Exception
class InvalidNumberException extends Exception {
 public InvalidNumberException(String message) {
     super(message);
 }
}

public class PositiveNumberStats {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int n = 5; // Can also be taken as dynamic input: scanner.nextInt()
     int[] numbers = new int[n];

     System.out.println("Enter " + n + " Numbers");
     for (int i = 0; i < n; i++) {
         numbers[i] = scanner.nextInt();
     }

     System.out.println("Numbers are");
     int sum = 0;
     int positiveCount = 0;

     for (int num : numbers) {
         try {
             // Raise InvalidNumberException for zero or negative numbers
             if (num <= 0) {
                 throw new InvalidNumberException("invalid Number" + num);
             }
             System.out.println(num);
             sum += num;
             positiveCount++;
         } catch (InvalidNumberException e) {
             System.out.println(e.getMessage());
         }
     }

     double average = positiveCount > 0 ? (double) sum / positiveCount : 0.0;

     System.out.println();
     System.out.println("sum of the positive numbers are: " + sum);
     System.out.println("Average of these numbers: " + average);

     scanner.close();
 }
}
