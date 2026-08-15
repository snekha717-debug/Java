package practice4;
import java.util.Scanner;
class Circle {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Computes and displays area (πr²) and circumference (2πr)
    public void displayDetails() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius        : " + radius);
        System.out.printf("Area          : %.2f\n", area);
        System.out.printf("Circumference : %.2f\n", circumference);
    }
}
public class Question2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();

        scanner.close();
    }
}
