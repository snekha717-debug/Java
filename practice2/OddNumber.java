package practice2;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter n:");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            if (i % 2 == 0)
		                continue;

		            System.out.println(i);

	}
	sc.close();
}
}