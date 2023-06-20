package pl.nauka;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JTextField tf;
        JButton btn;
        JFrame frm;

        btn = new JButton("dodaj");
        frm = new JFrame("MathBooster");
        tf = new JTextField();

        new Frame(frm);
        new Buttons(frm, btn);
        new TextField(frm, tf);
    }
}
