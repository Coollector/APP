package com.coollector.pages.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.coollector.utils.Window;

public class HomePage extends JPanel implements ActionListener {
    public HomePage() {
        setPreferredSize(Window.windowSize);
        setBackground(Color.black);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println();
        }
    }
}