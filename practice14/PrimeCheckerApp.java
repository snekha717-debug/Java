package practice14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeCheckerApp extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel statusLabel;
    private JButton checkBtn;

    public PrimeCheckerApp() {
        setTitle("Prime Number Checker");
        setSize(360, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 8, 8));

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Enter Number:"));
        inputField = new JTextField(12);
        inputPanel.add(inputField);
        add(inputPanel);

        JPanel btnPanel = new JPanel(new FlowLayout());
        checkBtn = new JButton("Check Prime");
        checkBtn.addActionListener(this);
        btnPanel.add(checkBtn);
        add(btnPanel);

        statusLabel = new JLabel("Result will appear here", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 13));
        add(statusLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            long num = Long.parseLong(inputField.getText().trim());
            if (isPrime(num)) {
                statusLabel.setText(num + " is a PRIME number.");
                statusLabel.setForeground(new Color(0, 130, 0));
            } else {
                statusLabel.setText(num + " is NOT a prime number.");
                statusLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PrimeCheckerApp::new);
    }
}