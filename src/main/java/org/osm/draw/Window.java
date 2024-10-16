package org.osm.draw;

import org.osm.entity.Bound;
import org.osm.entity.Osm;
import org.osm.utils.GeoMath;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private final int width;
    private final int height;

    public Window(Osm osm) {
        var windowSize = GeoMath.getWindowSizeFromBound(osm.getBounds());
        width = windowSize[0];
        height = windowSize[1];
        initWindow();
        add(new NodeDraw(osm.getNodes(), osm.getBounds()));
        add(new WayDraw(osm.getWays(),osm.getNodes(), osm.getBounds()));
    }

    private void initWindow() {
        setTitle("Draw Lines");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
