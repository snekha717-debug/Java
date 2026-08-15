package practice5;
import java.util.Vector;
public class Question4 {

	public static void main(String[] args) {
Vector<Integer> numbers = new Vector<>();
        
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);

        // Assume the first element is the largest initially
        int max = numbers.get(0);
        
        // Loop to find the maximum value
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("The largest number is: " + max);

	}

}
