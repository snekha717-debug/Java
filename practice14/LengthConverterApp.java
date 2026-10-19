package practice14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LengthConverterApp extends JFrame implements ActionListener {
    private JTextField feetField, inchesField, cmField;
    private JButton convertBtn;

    public LengthConverterApp() {
        setTitle("Length Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Feet: ", SwingConstants.RIGHT));
        feetField = new JTextField();
        add(feetField);

        add(new JLabel("Inches: ", SwingConstants.RIGHT));
        inchesField = new JTextField();
        add(inchesField);

        add(new JLabel("Centimeters: ", SwingConstants.RIGHT));
        cmField = new JTextField();
        cmField.setEditable(false);
        add(cmField);

        add(new JLabel(""));
        convertBtn = new JButton("Convert");
        convertBtn.addActionListener(this);
        add(convertBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String feetText = feetField.getText().trim();
            String inchesText = inchesField.getText().trim();

            double feet = feetText.isEmpty() ? 0.0 : Double.parseDouble(feetText);
            double inches = inchesText.isEmpty() ? 0.0 : Double.parseDouble(inchesText);

            if (feet < 0 || inches < 0) {
                JOptionPane.showMessageDialog(this, "Lengths cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double totalCm = (feet * 30.48) + (inches * 2.54);
            cmField.setText(String.format("%.2f cm", totalCm));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LengthConverterApp::new);
    }
}