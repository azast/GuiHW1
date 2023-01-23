package com.company;
import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public Main() {
        setTitle("Simple GUI");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] options = {"One", "Two", "Three"};

        JComboBox combo1 = new JComboBox(options);

        JButton button1 = new JButton("Click Me!");

        JButton button2 = new JButton("Quit program");

        button2.addActionListener(e->System.exit(0));

        add(button1, BorderLayout.CENTER);
        add(button2, BorderLayout.WEST);
        add(combo1);

        button1.setBounds(100, 100, 130, 40);
        button2.setBounds(0,0,50,50);

        combo1.addActionListener(e -> {
            System.out.println(combo1.getSelectedItem());
            ;
        });
    }

    public static void main(String[] args) {
        Main gui = new Main();
        gui.setVisible(true);
    }
}

