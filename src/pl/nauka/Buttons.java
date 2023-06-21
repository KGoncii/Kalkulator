package pl.nauka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    public Buttons(JFrame frm) {

        btn1 = new JButton("1");
        btn1.setBounds(10,290,80,80);
        frm.add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(100,290,80,80);
        frm.add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(190,290,80,80);
        frm.add(btn3);

        btn4 = new JButton("4");
        btn4.setBounds(10,200,80,80);
        frm.add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(100,200,80,80);
        frm.add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(190,200,80,80);
        frm.add(btn6);

        btn7 = new JButton("7");
        btn7.setBounds(10,110,80,80);
        frm.add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(100,110,80,80);
        frm.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(190,110,80,80);
        frm.add(btn9);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String btn1 = bt
    }
}
