import evenpackage.Even;
import java.util.Scanner;
public class CheckEvenMain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(args.length > 0 ? null : System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Call the static method directly via the class name
        if (Even.isEven(num)) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        scanner.close();
    }
}
