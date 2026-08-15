package practice5;
import java.util.Vector;
public class Question1 {

	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();

        // Add 5 fruits to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruit List:");
        
        // Display each element using an enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);

	}

}
}
