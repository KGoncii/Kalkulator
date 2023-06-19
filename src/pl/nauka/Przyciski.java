package pl.nauka;

import javax.swing.*;

public class Przyciski {
    public Przyciski(JFrame f) {
        JButton Dodaj=new JButton("Click Here");
        Dodaj.setBounds(50,100,95,30);
        f.add(Dodaj);
    }
}
