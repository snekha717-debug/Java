package demos;
import java.util.Scanner;

public class fibonacciSeies {
	static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int count=sc.nextInt();
		System.out.println("Fibonacci Series:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
	}

}
