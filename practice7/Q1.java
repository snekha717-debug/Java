package practice7;
import java.util.Scanner;

//Base class
class Employee {
 String name;
 String address;
 int age;
 int mob;
 float sal;

 public void print_Salary() {
     System.out.println("Salary: " + sal);
 }
}

//Derived class: Officer
class Officer extends Employee {
 String spl;

 public void print_Specialization() {
     System.out.println("Specialization: " + spl);
 }
}

//Derived class: Manager
class Manager extends Employee {
 String dep;

 public void print_Dept() {
     System.out.println("Department: " + dep);
 }
}
public class Q1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Officer Input ---
        Officer officer = new Officer();
        System.out.print("Enter Officer's Name: ");
        officer.name = sc.nextLine();

        System.out.print("Enter Address: ");
        officer.address = sc.nextLine();

        System.out.print("Enter Age: ");
        officer.age = sc.nextInt();

        System.out.print("Enter Mobile: ");
        officer.mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        officer.sal = sc.nextFloat();
        sc.nextLine(); // Clear scanner buffer

        System.out.print("Enter Specialization: ");
        officer.spl = sc.nextLine();

        System.out.println();

        // --- Manager Input ---
        Manager manager = new Manager();
        System.out.print("Enter Manager's Name: ");
        manager.name = sc.nextLine();

        System.out.print("Enter Address: ");
        manager.address = sc.nextLine();

        System.out.print("Enter Age: ");
        manager.age = sc.nextInt();

        System.out.print("Enter Mobile: ");
        manager.mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        manager.sal = sc.nextFloat();
        sc.nextLine(); // Clear scanner buffer

        System.out.print("Enter Department: ");
        manager.dep = sc.nextLine();

        // --- Officer Details Output ---
        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + officer.name);
        System.out.println("Address: " + officer.address);
        System.out.println("Age: " + officer.age);
        System.out.println("Mobile: " + officer.mob);
        officer.print_Salary();
        officer.print_Specialization();

        // --- Manager Details Output ---
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + manager.name);
        System.out.println("Address: " + manager.address);
        System.out.println("Age: " + manager.age);
        System.out.println("Mobile: " + manager.mob);
        manager.print_Salary();
        manager.print_Dept();

        sc.close();
    }
}
