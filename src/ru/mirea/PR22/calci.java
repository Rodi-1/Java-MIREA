package ru.mirea.PR22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Toolkit;

public class calci {

    private JFrame frmCalculator;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;



    /**
     * Launch the application.
     * @author MohammedAjmalIqbol
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calci window = new calci();
                    window.frmCalculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public calci() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCalculator = new JFrame();
        frmCalculator.setFont(new Font("Tahoma", Font.BOLD, 35));
        frmCalculator.setResizable(false);
        frmCalculator.setAlwaysOnTop(true);
        frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MohammedAjmalIqbol\\Downloads\\download (3).png"));
        frmCalculator.setTitle("Simple Calculator App");
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCalculator.setVisible(true);
        frmCalculator.setBounds(100, 100, 461, 516);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 50));
        textField.setBounds(10, 22, 426, 62);
        textField.setAutoscrolls(false);
        textField.setAlignmentX(5.0f);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("B");
        btnNewButton.setBounds(10, 106, 99, 62);
        btnNewButton.setActionCommand("New Button");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //code to be written
                String str = null;
                if(textField.getText().length() > 0) {
                    StringBuilder sb = new StringBuilder(textField.getText());
                    sb.deleteCharAt(textField.getText().length()-1);
                    str = sb.toString();
                    textField.setText(str);
                }
            }
        });

        JButton btnNewButton_1 = new JButton("C");
        btnNewButton_1.setBounds(119, 106, 99, 62);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_1.setActionCommand("New Button");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });

        JButton btnNewButton_2 = new JButton("7");
        btnNewButton_2.setBounds(10, 179, 99, 62);
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_2.setActionCommand("New Button");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_2.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_3 = new JButton("8");
        btnNewButton_3.setBounds(119, 179, 99, 62);
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_3.setActionCommand("New Button");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_3.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_4 = new JButton("4");
        btnNewButton_4.setBounds(10, 252, 99, 62);
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_4.setActionCommand("New Button");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_4.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_5 = new JButton("5");
        btnNewButton_5.setBounds(119, 252, 99, 62);
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_5.setActionCommand("New Button");
        // number action print in textbox
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_5.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_6 = new JButton("1");
        btnNewButton_6.setBounds(10, 325, 99, 62);
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_6.setActionCommand("New Button");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_6.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_7 = new JButton("2");
        btnNewButton_7.setBounds(119, 325, 99, 62);
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_7.getText();
                textField.setText(number);
            }
        });
        btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_7.setActionCommand("New Button");

        JButton btnNewButton_8 = new JButton("00");
        btnNewButton_8.setBounds(228, 106, 99, 62);
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_8.setActionCommand("New Button");
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_8.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_9 = new JButton("9");
        btnNewButton_9.setBounds(228, 179, 99, 62);
        btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_9.setActionCommand("New Button");
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_9.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_10 = new JButton("6");
        btnNewButton_10.setBounds(228, 252, 99, 62);
        btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnNewButton_10.setActionCommand("New Button");
        btnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_10.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_11 = new JButton("3");
        btnNewButton_11.setBounds(228, 325, 99, 62);
        btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_11.setActionCommand("New Button");
        btnNewButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_11.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_12 = new JButton("+");
        btnNewButton_12.setBounds(337, 106, 99, 62);
        btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_12.setActionCommand("New Button");
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });

        JButton btnNewButton_13 = new JButton("0");
        btnNewButton_13.setBounds(10, 398, 99, 62);
        btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_13.setActionCommand("New Button");
        btnNewButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_13.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_14 = new JButton(".");
        btnNewButton_14.setBounds(119, 398, 99, 62);
        btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_14.setActionCommand("New Button");
        btnNewButton_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_14.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_15 = new JButton("=");
        btnNewButton_15.setBounds(228, 398, 99, 62);
        btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_15.setActionCommand("New Button");
        btnNewButton_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String answer;
                second = Double.parseDouble(textField.getText());

                if(operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }

            }
        });

        JButton btnNewButton_16 = new JButton("-");
        btnNewButton_16.setBounds(337, 179, 99, 62);
        btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_16.setActionCommand("New Button");
        btnNewButton_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });

        JButton btnNewButton_10_1 = new JButton("*");
        btnNewButton_10_1.setBounds(337, 252, 99, 62);
        btnNewButton_10_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_1.setActionCommand("New Button");
        btnNewButton_10_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });

        JButton btnNewButton_10_2 = new JButton("/");
        btnNewButton_10_2.setBounds(337, 325, 99, 62);
        btnNewButton_10_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_2.setActionCommand("New Button");
        btnNewButton_10_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });

        JButton btnNewButton_10_3 = new JButton("%");
        btnNewButton_10_3.setBounds(337, 398, 99, 62);
        btnNewButton_10_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_3.setActionCommand("New Button");
        btnNewButton_10_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        frmCalculator.getContentPane().setLayout(null);
        frmCalculator.getContentPane().add(textField);
        frmCalculator.getContentPane().add(btnNewButton);
        frmCalculator.getContentPane().add(btnNewButton_1);
        frmCalculator.getContentPane().add(btnNewButton_2);
        frmCalculator.getContentPane().add(btnNewButton_3);
        frmCalculator.getContentPane().add(btnNewButton_4);
        frmCalculator.getContentPane().add(btnNewButton_5);
        frmCalculator.getContentPane().add(btnNewButton_6);
        frmCalculator.getContentPane().add(btnNewButton_7);
        frmCalculator.getContentPane().add(btnNewButton_8);
        frmCalculator.getContentPane().add(btnNewButton_9);
        frmCalculator.getContentPane().add(btnNewButton_10);
        frmCalculator.getContentPane().add(btnNewButton_11);
        frmCalculator.getContentPane().add(btnNewButton_12);
        frmCalculator.getContentPane().add(btnNewButton_13);
        frmCalculator.getContentPane().add(btnNewButton_14);
        frmCalculator.getContentPane().add(btnNewButton_15);
        frmCalculator.getContentPane().add(btnNewButton_16);
        frmCalculator.getContentPane().add(btnNewButton_10_1);
        frmCalculator.getContentPane().add(btnNewButton_10_2);
        frmCalculator.getContentPane().add(btnNewButton_10_3);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 2, 2);
        frmCalculator.getContentPane().add(scrollPane);
    }
}