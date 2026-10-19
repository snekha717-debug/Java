package practice13;

//Abstract base class
abstract class Shape {
 abstract void numberOfSides();
 abstract void sumOfAngles();
}

//Rectangle subclass
class Rectangle extends Shape {
 private final int sides = 4;

 @Override
 void numberOfSides() {
     System.out.println("Number of sides in Rectangle: " + sides);
 }

 @Override
 void sumOfAngles() {
     // Formula: (n - 2) * 180
     int sum = (sides - 2) * 180;
     System.out.println("Sum of angles in Rectangle: " + sum + " degrees");
 }
}

//Triangle subclass
class Triangle extends Shape {
 private final int sides = 3;

 @Override
 void numberOfSides() {
     System.out.println("Number of sides in Triangle: " + sides);
 }

 @Override
 void sumOfAngles() {
     // Formula: (n - 2) * 180
     int sum = (sides - 2) * 180;
     System.out.println("Sum of angles in Triangle: " + sum + " degrees");
 }
}

//Hexagon subclass
class Hexagon extends Shape {
 private final int sides = 6;

 @Override
 void numberOfSides() {
     System.out.println("Number of sides in Hexagon: " + sides);
 }

 @Override
 void sumOfAngles() {
     // Formula: (n - 2) * 180
     int sum = (sides - 2) * 180;
     System.out.println("Sum of angles in Hexagon: " + sum + " degrees");
 }
}

//Main Driver Class
public class ShapeDemo {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle();
     Shape triangle = new Triangle();
     Shape hexagon = new Hexagon();

     // Rectangle details
     rectangle.numberOfSides();
     rectangle.sumOfAngles();
     System.out.println();

     // Triangle details
     triangle.numberOfSides();
     triangle.sumOfAngles();
     System.out.println();

     // Hexagon details
     hexagon.numberOfSides();
     hexagon.sumOfAngles();
 }
}