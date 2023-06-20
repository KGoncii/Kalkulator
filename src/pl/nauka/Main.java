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
        frm = new JFrame("kalkulator");
        btn.setBounds(40,40,180,180);
        frm.setSize(500, 500);
        frm.add(btn);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}
