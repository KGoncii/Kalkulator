package pl.nauka;

import javax.swing.*;

public class Okienko {
    public void okienko(){
        JFrame f=new JFrame("Kalkulator");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        new Przyciski(f);
    }
}
