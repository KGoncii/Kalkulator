package pl.nauka;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JTextField tf;
        JButton btn;
        JFrame frm;
        Icon icon = new ImageIcon("C:\\Users\\kacpe\\OneDrive\\Pulpit\\kalkulator\\src\\pl\\nauka\\logo.png");
        btn = new JButton(icon);
        frm = new JFrame("MathBooster");
        tf = new JTextField();
        frm.setIconImage(((ImageIcon) icon).getImage());
        tf.setBounds(10, 20, 480, 80);
        btn.setBounds(10,110,180,180);
        frm.setSize(515, 500);
        frm.add(btn);
        frm.add(tf);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}
