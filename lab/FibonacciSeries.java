package lab;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit value: ");
        long limit = scanner.nextLong();

        long first = 0, second = 1;

        System.out.print("Fibonacci numbers up to " + limit + ": ");

        for (; first <= limit; ) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        scanner.close();

	}

}
