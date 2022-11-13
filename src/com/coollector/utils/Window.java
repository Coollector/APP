package com.coollector.utils;

import com.coollector.errors.PageNotExisting;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    static public Dimension windowSize;

    public Window(int width, int height, String iconPath, String title) {

        windowSize = new Dimension(width, height);

        setIconImage(new ImageIcon(iconPath).getImage());
        setSize(windowSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setResizable(false);
        setTitle(title);
        setUndecorated(true);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void loadScene(String name) {
        getContentPane().removeAll();
        try {
            add(Pages.getPage(name));
        } catch (PageNotExisting e) {
            throw new RuntimeException(e);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
