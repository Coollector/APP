package com.coollector.pages.turmRechner;

import javax.swing.*;
import java.awt.*;

public class GoButton extends JButton {
    public GoButton(int width, int height){
        setPreferredSize(new Dimension(width, height));
        setIcon(new ImageIcon("pics/turm.png"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(null);
        setBackground(Color.black);
    }
}
