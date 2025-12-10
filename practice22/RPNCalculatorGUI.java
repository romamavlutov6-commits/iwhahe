package practice22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPNCalculatorGUI extends JFrame {
    private JTextField display;
    private RPNCalculator calc = new RPNCalculator();

    public RPNCalculatorGUI() {
        setTitle("RPN Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));

        // Кнопки
        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", ".", "=", "/",
                "C", "^", "%", "Space"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(new ButtonClickListener());
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                try {
                    double result = calc.evaluate(display.getText());
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    display.setText("Error: " + ex.getMessage());
                }
            } else if (command.equals("C")) {
                display.setText("");
                calc.clear();
            } else if (command.equals("Space")) {
                display.setText(display.getText() + " ");
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RPNCalculatorGUI();
            }
        });
    }
}