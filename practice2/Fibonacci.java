package practice2;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long first = 0, second = 1;
            
            System.out.print("First " + n + " Fibonacci numbers: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + (i < n ? ", " : "\n"));
                
                // Calculate the next number in the sequence
                long next = first + second;
                first = second;
                second = next;
            }
        }
        
        scanner.close();

	}

}
