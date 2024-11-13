package org.example;
import javax.swing.JFrame;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        temperatureConverter converter = new temperatureConverter();
        frame.setContentPane(converter.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setVisible(true);
    }
}