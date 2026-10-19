package practice14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrevNextApp extends JFrame implements ActionListener {
    private JTextField inputField, prevField, nextField;
    private JButton processBtn;

    public PrevNextApp() {
        setTitle("Previous & Next Number");
        setSize(380, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Three labels and three text fields as specified
        add(new JLabel("Enter Number: ", SwingConstants.RIGHT));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("Previous Number: ", SwingConstants.RIGHT));
        prevField = new JTextField();
        prevField.setEditable(false);
        add(prevField);

        add(new JLabel("Next Number: ", SwingConstants.RIGHT));
        nextField = new JTextField();
        nextField.setEditable(false);
        add(nextField);

        // One button
        add(new JLabel("")); 
        processBtn = new JButton("Calculate");
        processBtn.addActionListener(this);
        add(processBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            long number = Long.parseLong(inputField.getText().trim());
            prevField.setText(String.valueOf(number - 1));
            nextField.setText(String.valueOf(number + 1));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PrevNextApp::new);
    }
}