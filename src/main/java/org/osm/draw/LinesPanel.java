package org.osm.draw;

import javax.swing.*;
import java.awt.*;

class LinesPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast to Graphics2D for more advanced drawing options
        Graphics2D g2d = (Graphics2D) g;

        // Set the color for the first line
        g2d.setColor(Color.RED);
        // Draw the first line from (50, 50) to (200, 200)
        g2d.drawLine(50, 50, 200, 200);

        // Set the color for the second line
        g2d.setColor(Color.BLUE);
        // Draw the second line from (50, 200) to (200, 50)
        g2d.drawLine(50, 200, 200, 50);
    }
}
