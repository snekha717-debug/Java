package practice4;
import java.util.Scanner;

//Employee Class definition
class Employee {
 int empId;
 String empName;
 double salary;

 // Parameterized Constructor
 public Employee(int empId, String empName, double salary) {
     this.empId = empId;
     this.empName = empName;
     this.salary = salary;
 }

 // Method to display details
 public void displayEmployee() {
     System.out.println("Employee ID   : " + empId);
     System.out.println("Employee Name : " + empName);
     System.out.println("Salary        : ₹" + salary);
     System.out.println("-----------------------------");
 }
}
public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // --- Input for Employee 1 ---
        System.out.println("=== Enter Details for Employee 1 ===");
        System.out.print("Enter ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()
        
        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary1 = scanner.nextDouble();

        // Create first Employee object
        Employee emp1 = new Employee(id1, name1, salary1);

        // --- Input for Employee 2 ---
        System.out.println("\n=== Enter Details for Employee 2 ===");
        System.out.print("Enter ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()
        
        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary2 = scanner.nextDouble();

        // Create second Employee object
        Employee emp2 = new Employee(id2, name2, salary2);

        // --- Display Employee Details ---
        System.out.println("\n=============================");
        System.out.println("       EMPLOYEE DATA        ");
        System.out.println("=============================");
        emp1.displayEmployee();
        emp2.displayEmployee();

        scanner.close();

	}

}
