package praktika10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame {
    double a=0.0,b=0.0,c=0.0;
    String res;
    private JButton resultButton;
    private JPanel panel1;
    private JButton quotient;
    private JButton composition;
    private JButton difference;
    private JButton sum;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;

    JPanel getPanel1(){
        return panel1;
    }
    form(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panel1);
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(!textField1.getText().matches("[0-9]+")||!textField2.getText().matches("[0-9]+")){
                System.out.println(0);
            }
            a=Double.parseDouble(textField1.getText());
            b=Double.parseDouble(textField2.getText());
            c=a+b;
            label.setText(String.valueOf(c));
            }

        } );
        difference.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField1.getText().matches("[0-9]-")||!textField2.getText().matches("[0-9]-")){
                    System.out.println(0);
                }
                a=Double.parseDouble(textField1.getText());
                b=Double.parseDouble(textField2.getText());
                c=a-b;
                label.setText(String.valueOf(c));
            }
        });
        composition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textField1.getText());
                b=Double.parseDouble(textField2.getText());
                c=a*b;
                label.setText(String.valueOf(c));
            }
        });
        quotient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b == 0) {
                    res = "Error";
                    label.setText(res);
                }
                else{
                a=Double.parseDouble(textField1.getText());
                b=Double.parseDouble(textField2.getText());
                c=a/b;
                label.setText(String.valueOf(c));
            }}
        });
    }
}

