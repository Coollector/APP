package com.coollector.pages.turmRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene extends JPanel implements ActionListener {
    private Eingabe eingabe;
    private GoButton button;
    private Ausgabe ausgabe;

    public Scene() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.black);

        add(new Info());

        button = new GoButton(50, 100);
        button.addActionListener(this);

        eingabe = new Eingabe(200, 100);
        eingabe.addActionListener(this);

        ausgabe = new Ausgabe(250, 450);

        add(eingabe);
        add(button);
        add(ausgabe);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button || e.getSource() == eingabe) {
            calculate();
        }
    }

    public void calculate(){
        String ergebnis = "";
        double number = Integer.parseInt(eingabe.getText());
        ergebnis = ergebnis + number + "\n";
        for (int i = 2; i < 10; i++) {
            if (i == 9) {
                System.out.println("nummer 9");
                System.out.println(number);
                System.out.println(number * 9);
                System.out.println(number*i);
            }
            number = number * i;
            ergebnis = ergebnis + number + "\n";
        }
        for (int i = 2; i < 10; i++) {
            number = number / i;
            ergebnis = ergebnis + number + "\n";
        }
        ausgabe.setText(ergebnis);
        eingabe.setText("");
    }
}
