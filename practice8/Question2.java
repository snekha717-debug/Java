package practice8;
//Base class
class Bird {
 public void fly() {
     System.out.println("Birds have different ways of flying.");
 }
}

//Derived class Sparrow
class Sparrow extends Bird {
 @Override
 public void fly() {
     System.out.println("Sparrow flies short distances.");
 }
}

//Derived class Eagle
class Eagle extends Bird {
 @Override
 public void fly() {
     System.out.println("Eagle soars high in the sky.");
 }
}
public class Question2 {
	public static void main(String[] args) {
        // Array of base class (Bird) references holding different subclass objects
        Bird[] birds = {
            new Bird(),
            new Sparrow(),
            new Eagle()
        };

        // Demonstrating dynamic method dispatch via loop
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
