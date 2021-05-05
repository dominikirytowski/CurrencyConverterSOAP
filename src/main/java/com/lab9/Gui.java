package com.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    JFrame frame = new JFrame("Currency");
    JTextField textField = new JTextField();
    JTextField textField1 = new JTextField();
    JLabel jLabel = new JLabel("PLN");
    String[] curr = {"EUR", "USD", "GBP"};
    JComboBox comboBox = new JComboBox(curr);
    JButton jButton = new JButton("Calculate");
    Calculations calculations = new Calculations();
    public Gui(){
        frame.setSize(new Dimension(500,200));
        frame.setResizable(false);
        frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - 500) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - 200) / 2);
        frame.setDefaultCloseOperation(Gui.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField.setSize(new Dimension(100, 25));
        textField.setLocation(150,20);

        textField1.setSize(new Dimension(100, 25));
        textField1.setLocation(150,90);
        textField1.setEditable(false);

        comboBox.setSize(new Dimension(70,25));
        comboBox.setLocation(150, 50);

        jLabel.setLocation(50,90);

        jButton.setSize(new Dimension(100, 25));
        jButton.setLocation(150, 125);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedIndex() == 0){
                    textField1.setText(Double.toString(calculations.calculate("EUR", Double.parseDouble(textField.getText()))));
                }else if (comboBox.getSelectedIndex() == 1){
                    textField1.setText(Double.toString(calculations.calculate("USD", Double.parseDouble(textField.getText()))));
                }else if(comboBox.getSelectedIndex() == 2){
                    textField1.setText(Double.toString(calculations.calculate("GBP", Double.parseDouble(textField.getText()))));
                }

            }
        });
        frame.add(jButton);
        frame.add(comboBox);
        frame.add(textField);
        frame.add(textField1);
        frame.add(jLabel);
        frame.setVisible(true);

    }

}
