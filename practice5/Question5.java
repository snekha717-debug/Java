 package practice5;
 import java.util.Scanner;
 import java.util.Vector;
public class Question5 {

	public static void main(String[] args) {
		Vector<String> items = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        System.out.print("Enter an item to search: ");
        String searchItem = scanner.nextLine();

        // Check if the item exists in the vector
        if (items.contains(searchItem)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
        
        scanner.close();

	}

}
