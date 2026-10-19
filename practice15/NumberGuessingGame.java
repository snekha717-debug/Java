package practice15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame implements ActionListener {
    private int targetNumber;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel promptLabel;
    private JLabel feedbackLabel;

    public NumberGuessingGame() {
        // Generate initial random number between 1 and 100
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;

        // Frame setup
        setTitle("Number Guessing...");
        setSize(360, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Top prompt label
        promptLabel = new JLabel("Guess a number between 1 and 100:", SwingConstants.CENTER);
        promptLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(promptLabel, BorderLayout.NORTH);

        // Center panel for input and guess button
        JPanel centerPanel = new JPanel(new FlowLayout());
        guessField = new JTextField(8);
        guessField.setFont(new Font("Arial", Font.PLAIN, 14));
        guessButton = new JButton("Guess");
        guessButton.setFont(new Font("Arial", Font.BOLD, 13));
        guessButton.addActionListener(this);

        centerPanel.add(guessField);
        centerPanel.add(guessButton);
        add(centerPanel, BorderLayout.CENTER);

        // Bottom feedback label
        feedbackLabel = new JLabel(" ", SwingConstants.CENTER);
        feedbackLabel.setFont(new Font("Arial", Font.BOLD, 13));
        add(feedbackLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = guessField.getText().trim();

        try {
            int userGuess = Integer.parseInt(inputText);

            if (userGuess < 1 || userGuess > 100) {
                feedbackLabel.setText("Please enter a valid number between 1 and 100!");
            } else if (userGuess > targetNumber) {
                feedbackLabel.setText("Too high! Try again. Random number: " + targetNumber);
            } else if (userGuess < targetNumber) {
                feedbackLabel.setText("Too low! Try again. Random number: " + targetNumber);
            } else {
                feedbackLabel.setText("Correct! The number was " + targetNumber);
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Invalid input! Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberGuessingGame());
    }
}