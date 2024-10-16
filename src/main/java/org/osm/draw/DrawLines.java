package org.osm.draw;

import javax.swing.*;

public class DrawLines extends JFrame {
    public DrawLines(int width, int height) {
        setTitle("Draw Lines");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LinesPanel());
    }
}


