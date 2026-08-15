package practice3;
import java.util.Scanner;

public class ArrayElementPosition {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                System.out.println("Number " + target + " found at position (index): " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }
        
        scanner.close();

	}

}
