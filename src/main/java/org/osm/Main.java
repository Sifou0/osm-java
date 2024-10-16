package org.osm;

import org.osm.draw.DrawLines;
import org.osm.draw.Window;
import org.osm.entity.Osm;
import org.osm.utils.GeoMath;
import org.osm.utils.XmlReader;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Osm osm = XmlReader.readXml("map.osm");
        var windowSize = GeoMath.getWindowSizeFromBound(osm.getBounds());
        System.out.println(windowSize[0] + " x " + windowSize[1]);
        SwingUtilities.invokeLater(() -> new Window(osm).setVisible(true));
    }
}
