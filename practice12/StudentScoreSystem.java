package practice12;

import java.util.Scanner;

// Custom Unchecked Exception (extends RuntimeException)
class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private int score;

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

// Main Driver Class
public class StudentScoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("enter the score of the student");
        int inputScore = scanner.nextInt();

        try {
            student.setScore(inputScore);
            System.out.println("The score of the student" + student.getScore());
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}