package practice2;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        int original = scanner.nextInt();
        int num = original;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        if (original == reversed && original >= 0) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        
        scanner.close();

	}

}
