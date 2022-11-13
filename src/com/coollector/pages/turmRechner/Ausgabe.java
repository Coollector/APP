package com.coollector.pages.turmRechner;

import javax.swing.*;
import java.awt.*;

public class Ausgabe extends JTextPane {
    public Ausgabe(int width, int height){
        setPreferredSize(new Dimension(width, height));
        setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        setForeground(Color.white);
        setBackground(Color.black);
    }
}
