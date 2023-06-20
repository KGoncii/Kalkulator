package pl.nauka;

import javax.swing.*;

public class Frame {
    public Frame(JFrame frm) {
        Icon icon = new ImageIcon("C:\\Users\\kacpe\\OneDrive\\Pulpit\\kalkulator\\src\\pl\\nauka\\logo.png");
        frm.setSize(515, 500);
        frm.setIconImage(((ImageIcon) icon).getImage());
        frm.setLayout(null);
        frm.setVisible(true);
    }
}
