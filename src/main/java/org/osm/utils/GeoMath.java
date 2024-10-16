package org.osm.utils;

import org.osm.entity.Bound;
import org.osm.entity.Node;

import java.awt.*;

public class GeoMath {

    private final static double CONVERSION_VALUE = 1E5 / 2;

    // TODO: Handle the case of negative values
    public static Integer[] getWindowSizeFromBound(Bound bound) {
        Integer[] windowSize = new Integer[2];

        // Latitude = y
        double diffLat = bound.getMaxlat() - bound.getMinlat();
        // Longitude = x
        double diffLon = bound.getMaxlon() - bound.getMinlon();

        windowSize[0] = (int) (diffLon * CONVERSION_VALUE) / 2;
        windowSize[1] = (int) (diffLat * CONVERSION_VALUE) / 2;

        return windowSize;
    }

    // TODO: Handle the case of negative values
    // x = nodeX - minLon
    public static Point getPointPositionGivenWindowSize(Bound bound, Node node) {
        int x = (int) ((node.getLon() - bound.getMinlon()) * CONVERSION_VALUE);
        int y = (int) ((node.getLat() - bound.getMinlat()) * CONVERSION_VALUE);
        return new Point(x,y);
    }

}
