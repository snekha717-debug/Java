package practice14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FibonacciApp extends JFrame implements ActionListener {
    private JTextField limitField;
    private DefaultListModel<Long> listModel;
    private JList<Long> fibList;
    private JButton generateBtn, clearBtn;

    public FibonacciApp() {
        setTitle("Fibonacci Generator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Top Panel: Input
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Enter Limit (Max Value):"));
        limitField = new JTextField(10);
        topPanel.add(limitField);
        add(topPanel, BorderLayout.NORTH);

        // Center Panel: List with ScrollPane
        listModel = new DefaultListModel<>();
        fibList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(fibList);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom Panel: Buttons
        JPanel bottomPanel = new JPanel(new FlowLayout());
        generateBtn = new JButton("Generate");
        clearBtn = new JButton("Clear");
        generateBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        bottomPanel.add(generateBtn);
        bottomPanel.add(clearBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateBtn) {
            listModel.clear();
            try {
                long limit = Long.parseLong(limitField.getText().trim());
                if (limit < 0) {
                    JOptionPane.showMessageDialog(this, "Enter a non-negative number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                long a = 0, b = 1;
                while (a <= limit) {
                    listModel.addElement(a);
                    long next = a + b;
                    a = b;
                    b = next;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearBtn) {
            limitField.setText("");
            listModel.clear();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FibonacciApp::new);
    }
}