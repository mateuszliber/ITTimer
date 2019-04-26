package com.liber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timmerGUI {
    private JButton startButton;
    private JPanel mainPanel;
    private JTextField timmerField;
    private JButton stopButton;
    private JLabel label;

    public timmerGUI() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ITTimer");
        frame.setContentPane(new timmerGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
