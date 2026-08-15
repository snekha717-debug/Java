package practice3;
import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
        
        scanner.close();

	}

}
