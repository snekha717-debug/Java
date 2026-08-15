package practice5;
import java.util.Vector;
public class Question2 {

	public static void main(String[] args) {
		Vector<String> colors = new Vector<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Remove the specific element
        colors.remove("Green");

        // Print the final contents of the vector
        System.out.println("Final Vector contents: " + colors);
	}

}
