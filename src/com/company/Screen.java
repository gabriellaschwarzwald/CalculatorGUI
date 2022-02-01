package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    private JPanel panel1;
    private JPanel JPanelTop;
    private JLabel Title;
    private JButton additionButton;
    private JButton subButton;
    private JButton divisionButton;
    private JButton multButton;
    private JButton powerButton;
    private JButton rootButton;
    private JTextField Input1;
    private JTextField Input2;
    private JLabel Answer;
    private JButton squaredrootButton;
    private JButton squaredButton;

    public Screen() {

        super("Calculator Project");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String input1 = Input1.getText();
               double a = Double.parseDouble(input1);
               String input2 = Input2.getText();
               double b = Double.parseDouble(input2);
               double answer = a + b;
               Answer.setText(String.valueOf(answer));
            }

        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                double answer = a - b;
                Answer.setText(String.valueOf(answer));
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                double answer = a / b;
                Answer.setText(String.valueOf(answer));
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                double answer = a * b;
                Answer.setText(String.valueOf(answer));
            }
        });
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                double answer = Math.pow(a,b);
                Answer.setText(String.valueOf(answer));
            }
        });
        rootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                double answer = Math.pow(a,(1/b));
                Answer.setText(String.valueOf(answer));
            }
        });
        squaredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                double answer = a * a;
                Answer.setText(String.valueOf(answer));
            }
        });

        squaredrootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = Input1.getText();
                double a = Double.parseDouble(input1);
                String input2 = Input2.getText();
                double b = Double.parseDouble(input2);
                    double answer = Math.sqrt(a);

                Answer.setText(String.valueOf(answer));
            }
        });
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
    }

}
