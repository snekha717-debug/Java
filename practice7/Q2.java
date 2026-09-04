package practice7;
import java.util.Scanner;

//Base class
class Students {
 String name;
 int rollNo;
 String course;

 public void setStudentDetails(String name, int rollNo, String course) {
     this.name = name;
     this.rollNo = rollNo;
     this.course = course;
 }

 public void displayStudentDetails() {
     System.out.println("Name: " + name);
     System.out.println("Roll No: " + rollNo);
     System.out.println("Course: " + course);
 }
}

//Intermediate class (inherits Students)
class StudentAccount extends Students {
 double collegeFee;

 public void setCollegeFee(double collegeFee) {
     this.collegeFee = collegeFee;
 }

 public void displayCollegeFee() {
     System.out.println("College Fee: " + collegeFee);
 }
}

//Derived class 1 (inherits StudentAccount -> multi-level)
class Hosteller extends StudentAccount {
 double hostelFee;
 double messFee;

 public void setHostelDetails(double hostelFee, double messFee) {
     this.hostelFee = hostelFee;
     this.messFee = messFee;
 }

 public void displayAllDetails() {
     displayStudentDetails();
     displayCollegeFee();
     System.out.println("Hostel Fee: " + hostelFee);
     System.out.println("Mess Fee: " + messFee);
     double totalFee = collegeFee + hostelFee + messFee;
     System.out.println("Total Fee: " + totalFee);
 }
}

//Derived class 2 (inherits StudentAccount -> multi-level)
class DayScholar extends StudentAccount {
 double busFee;

 public void setBusFee(double busFee) {
     this.busFee = busFee;
 }

 public void displayAllDetails() {
     displayStudentDetails();
     displayCollegeFee();
     System.out.println("Bus Fee: " + busFee);
     double totalFee = collegeFee + busFee;
     System.out.println("Total Fee: " + totalFee);
 }
}
public class Q2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Hosteller Input ---
        Hosteller hosteller = new Hosteller();

        System.out.print("Enter Hosteller's Name: ");
        String hName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int hRoll = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Course: ");
        String hCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double hCollegeFee = sc.nextDouble();

        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();

        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();
        sc.nextLine(); // Clear buffer

        hosteller.setStudentDetails(hName, hRoll, hCourse);
        hosteller.setCollegeFee(hCollegeFee);
        hosteller.setHostelDetails(hostelFee, messFee);

        System.out.println();

        // --- Day Scholar Input ---
        DayScholar dayScholar = new DayScholar();

        System.out.print("Enter Day Scholar's Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int dRoll = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Course: ");
        String dCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double dCollegeFee = sc.nextDouble();

        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();

        dayScholar.setStudentDetails(dName, dRoll, dCourse);
        dayScholar.setCollegeFee(dCollegeFee);
        dayScholar.setBusFee(busFee);

        // --- Hosteller Output ---
        System.out.println("\n--- HOSTELLER DETAILS ---");
        hosteller.displayAllDetails();

        // --- Day Scholar Output ---
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        dayScholar.displayAllDetails();

        sc.close();
    }
}
