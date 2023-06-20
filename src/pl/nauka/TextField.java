package pl.nauka;

import javax.swing.*;

public class TextField {
    public TextField(JFrame frm) {
        JTextField tf;
        tf = new JTextField();
        tf.setBounds(10, 20, 480, 80);
        frm.add(tf);
    }
}
