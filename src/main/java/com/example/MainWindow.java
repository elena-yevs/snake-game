package com.example;

import javax.swing.*;

public class MainWindow extends JFrame {
    //конструктор, в котором описаны св-ва класса
    public MainWindow(){
        setTitle("Змейка");
        /*
        Программа завершает работу, после нажатия на "крестик"
         */
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,354);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw =new MainWindow();
    }
}
