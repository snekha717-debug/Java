package practice2;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input! Please enter a four-digit number.");
        } else {
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }

            System.out.println("Sum of digits = " + sum);
        }

        sc.close();
	}

}
