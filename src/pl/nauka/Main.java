package pl.nauka;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frm;
        frm = new JFrame("MathBooster");

        new Buttons(frm);
        new Frame(frm);
        new TextField(frm);
    }
}
