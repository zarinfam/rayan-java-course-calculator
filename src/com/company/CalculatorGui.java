package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by saeed on 4/28/16.
 */
public class CalculatorGui {
    public static final String[][] BUTTON_TEXTS = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"0", ".", "=", "/"}
    };
    public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    private final JTextField display;

    public CalculatorGui() {
        display = new JTextField(10);
        display.setEnabled(false);
        display.setFont(BTN_FONT.deriveFont(Font.PLAIN));
        JPanel btnPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length,
                BUTTON_TEXTS[0].length));

        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                JButton btn = new JButton(BUTTON_TEXTS[i][j]);
                btn.setFont(BTN_FONT);
                btnPanel.add(btn);
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(display, BorderLayout.PAGE_START);
        mainPanel.add(btnPanel, BorderLayout.CENTER);


        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
