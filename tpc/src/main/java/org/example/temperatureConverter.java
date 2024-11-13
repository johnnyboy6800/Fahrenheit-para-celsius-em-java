package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temperatureConverter implements ActionListener{
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    public JPanel  mainPanel;
    public JLabel label2;
    public boolean buttonclick = false;


    public temperatureConverter() {
        label1  = new JLabel("Insira um valor Fahrenheit para converter para celsius");
        label2 = new JLabel();
        textField1  = new JTextField(10);
        button1 = new JButton("converter valor");
        button1.setBackground(Color.darkGray);
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 1)); // Define um layout simples
        mainPanel.add(label1);
        mainPanel.add(label2);
        mainPanel.add(textField1);
        mainPanel.add(button1);

    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonclick = true;
        try {
            var valor = textField1.getText();
            int result = Integer.parseInt(valor);
            int calculo = (result - 32) * 5 / 9;

            label2.setText(calculo + "º graus celsius");
            mainPanel.revalidate();
            mainPanel.repaint();
        }catch (Exception error) {
            JOptionPane.showMessageDialog(null, "insira um número inteiro");

        }
    }
}

