package practice4;

import java.util.Scanner;

class Marks {
    double mark1, mark2, mark3;

    // Constructor to initialize all marks
    public Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Calculates and returns the total marks
    public double getTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculates and returns the average marks
    public double getAverage() {
        return getTotal() / 3.0;
    }

    // Displays the final results
    public void displayResult() {
        System.out.println("Total Marks : " + getTotal());
        System.out.printf("Average     : %.2f\n", getAverage());
        System.out.println("-------------------------");
    }
}

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        double m1 = scanner.nextDouble();
        
        System.out.print("Enter mark 2: ");
        double m2 = scanner.nextDouble();
        
        System.out.print("Enter mark 3: ");
        double m3 = scanner.nextDouble();

        Marks studentMarks = new Marks(m1, m2, m3);

        System.out.println("\n=== Student Result ===");
        studentMarks.displayResult();

        scanner.close();

	}

}
