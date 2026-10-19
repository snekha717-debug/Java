package practice14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class FactorialApp extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton computeBtn;

    public FactorialApp() {
        setTitle("Factorial Calculator");
        setSize(360, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 8, 8));

        add(new JLabel("Enter Number: ", SwingConstants.RIGHT));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("Factorial: ", SwingConstants.RIGHT));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        add(new JLabel("")); // Empty placeholder
        computeBtn = new JButton("Compute");
        computeBtn.addActionListener(this);
        add(computeBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(inputField.getText().trim());
            if (n < 0) {
                JOptionPane.showMessageDialog(this, "Factorial is not defined for negative numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            BigInteger fact = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            resultField.setText(fact.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FactorialApp::new);
    }
}