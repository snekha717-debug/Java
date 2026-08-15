package practice3;
import java.util.Scanner;

public class ArraySumAverage {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            System.exit(0);
        }
        
        int[] numbers = new int[n];
        double sum = 0;
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        double average = sum / n;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();

	}

}
