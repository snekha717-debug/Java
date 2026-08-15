package lab;
import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        
        for (int n = num; n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }
        
        System.out.println("Reversed Number: " + reversed);
        
        scanner.close();
	}

}
