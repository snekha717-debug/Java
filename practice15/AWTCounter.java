package practice15;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCountUp;
    private Button btnCountDown;
    private Button btnReset;
    private int count = 0;

    public AWTCounter() {
        // Frame setup
        setTitle("AWT Counter");
        setLayout(new FlowLayout());

        // Label
        lblCount = new Label("Counter");
        add(lblCount);

        // Non-editable text field initialized to 0
        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        // Buttons
        btnCountUp = new Button("Count Up");
        add(btnCountUp);
        btnCountUp.addActionListener(this);

        btnCountDown = new Button("Count Down");
        add(btnCountDown);
        btnCountDown.addActionListener(this);

        btnReset = new Button("Reset");
        add(btnReset);
        btnReset.addActionListener(this);

        // Window closing handler
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(400, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnCountUp) {
            count++;
        } else if (source == btnCountDown) {
            count--;
        } else if (source == btnReset) {
            count = 0;
        }

        tfCount.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new AWTCounter();
    }
}