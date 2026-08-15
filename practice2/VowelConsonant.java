package practice2;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a character:");
	        String ch = sc.next();

	        switch (ch) {
	            case "a":
	            case "e":
	            case "i":
	            case "o":
	            case "u":
	            case "A":
	            case "E":
	            case "I":
	            case "O":
	            case "U":
	                System.out.println("Vowel");
	                break;

	            default:
	                System.out.println("Consonant");

	}
    sc.close();
}
}
