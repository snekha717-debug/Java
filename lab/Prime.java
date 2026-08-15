package lab;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100:");
		for (int num = 2; num <= 100; num++) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(num + " ");
        }

	}

}
