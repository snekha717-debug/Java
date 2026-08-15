package practice3;
import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            System.exit(0);
        }
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
        scanner.close();

	}

}
