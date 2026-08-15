package practice5;
import java.util.Vector;
public class Question3 {
	public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        
        // Loop through the vector to calculate the sum
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of all elements: " + sum);
    }
}
