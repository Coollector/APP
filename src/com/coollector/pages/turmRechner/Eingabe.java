package com.coollector.pages.turmRechner;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Eingabe extends JTextField {
    public Eingabe(int width, int height){
        setPreferredSize(new Dimension(width, height));
        setBorder(new LineBorder(new Color(0x21E50B),4));
        setFont(new Font("SANS_SERIF", Font.BOLD, 40));
        setHorizontalAlignment(CENTER);
    }
}
