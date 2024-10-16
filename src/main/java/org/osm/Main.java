package org.osm;

import org.osm.draw.DrawLines;
import org.osm.draw.Window;
import org.osm.entity.Link;
import org.osm.entity.Osm;
import org.osm.entity.Way;
import org.osm.utils.GeoMath;
import org.osm.utils.XmlReader;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osm osm = XmlReader.readXml("map.osm");
        SwingUtilities.invokeLater(() -> new Window(osm).setVisible(true));
    }
}
