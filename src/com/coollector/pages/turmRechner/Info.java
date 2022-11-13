package com.coollector.pages.turmRechner;

import javax.swing.*;
import java.awt.*;

public class Info extends JLabel {
    public Info(){
        setPreferredSize(new Dimension(400, 60));
        setText("Zahl eingeben und den Turm klicken");
        setFont(new Font("SANS_SERIF", Font.PLAIN, 20));
        setForeground(Color.green);
        setHorizontalAlignment(CENTER);
    }
}
