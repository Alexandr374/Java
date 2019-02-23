package ru.geekbrains.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Integer.parseInt;

public class MyWindow extends JFrame implements KeyListener {
    private JTextField number1, number2;
    private JLabel result;

    MyWindow(){
        setTitle("Сравнение чисел");
        setBounds(300,300,500,100);
        setResizable(false);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        number1 = new JTextField(10);
        number1.addKeyListener(this);
        number2 = new JTextField(10);
        number2.addKeyListener(this);
        result = new JLabel("?");
        add(number1);
        add(result);
        add(number2);
        setVisible(true);
    }

    public void keyReleased (KeyEvent key){
        JTextField tField = (JTextField)key.getSource();
        Integer.parseInt(tField.getText());
        int num1, num2;
        num1 = Integer.parseInt(number1.getText());
        num2 = Integer.parseInt(number2.getText());
        if (num1 > num2){
            result.setText(">");
        } else if (num1 < num2){
            result.setText("<");
        }else result.setText("=");

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
