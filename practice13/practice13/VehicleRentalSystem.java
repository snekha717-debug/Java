package practice13;

import java.util.Scanner;

// Interface Displayable
interface Displayable {
    void showDetails(int days);
}

// Abstract Class Vehicle
abstract class Vehicle {
    protected int vehicleId;
    protected String vehicleName;
    protected double rentalPricePerDay;

    public Vehicle(int vehicleId, String vehicleName, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Abstract method to calculate rental amount
    abstract double calculateRentalAmount(int days);

    // Concrete method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rental Price Per Day: " + rentalPricePerDay);
    }
}

// Concrete Class Car
class Car extends Vehicle implements Displayable {

    public Car(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    double calculateRentalAmount(int days) {
        double total = rentalPricePerDay * days;
        if (days > 5) {
            total -= total * 0.10; // 10% discount
        }
        return total;
    }

    @Override
    public void showDetails(int days) {
        displayVehicleDetails();
        System.out.println("Days Rented: " + days);
        System.out.println("Total Rental Amount: " + calculateRentalAmount(days));
    }
}

// Concrete Class Bike
class Bike extends Vehicle implements Displayable {

    public Bike(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    double calculateRentalAmount(int days) {
        double total = rentalPricePerDay * days;
        if (days > 3) {
            total -= total * 0.05; // 5% discount
        }
        return total;
    }

    @Override
    public void showDetails(int days) {
        displayVehicleDetails();
        System.out.println("Days Rented: " + days);
        System.out.println("Total Rental Amount: " + calculateRentalAmount(days));
    }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating Car and Bike instances
        Car car = new Car(101, "Sedan", 2000.0);
        Bike bike = new Bike(201, "Sports Bike", 500.0);

        // Input days for Car
        System.out.print("Enter number of rental days for Car: ");
        int carDays = scanner.nextInt();

        // Input days for Bike
        System.out.print("Enter number of rental days for Bike: ");
        int bikeDays = scanner.nextInt();

        System.out.println("\n--- Car Rental Details ---");
        car.showDetails(carDays);

        System.out.println("\n--- Bike Rental Details ---");
        bike.showDetails(bikeDays);

        scanner.close();
    }
}