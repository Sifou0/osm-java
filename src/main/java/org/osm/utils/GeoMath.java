package org.osm.utils;

import org.osm.entity.Bound;
import org.osm.entity.Link;
import org.osm.entity.Node;
import org.osm.entity.Way;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class GeoMath {

    private final static double CONVERSION_VALUE = 1E5 / 2;

    // TODO: Handle the case of negative values
    public static Integer[] getWindowSizeFromBound(Bound bound) {
        Integer[] windowSize = new Integer[2];

        // Latitude = y
        double diffLat = bound.getMaxlat() - bound.getMinlat();
        // Longitude = x
        double diffLon = bound.getMaxlon() - bound.getMinlon();

        windowSize[0] = (int) (diffLon * CONVERSION_VALUE);
        windowSize[1] = (int) (diffLat * CONVERSION_VALUE);

        return windowSize;
    }

    // TODO: Handle the case of negative values
    // x = nodeX - minLon
    public static Point getPointPositionGivenWindowSize(Bound bound, Node node) {
        int x = (int) ((node.getLon() - bound.getMinlon()) * CONVERSION_VALUE);
        int y = (int) ((node.getLat() - bound.getMinlat()) * CONVERSION_VALUE);
        return new Point(x, y);
    }

    public static List<Link> buildLinks(List<Way> ways, List<Node> nodes, Bound bound) {
        Map<String, Node> nodesById = nodes.stream().collect(Collectors.toMap(Node::getId, node -> node));
        return ways.stream().map(way -> {
            List<Point> points = way.getNodeConnectionList().stream().map(nodeConnection -> {
                Node node = nodesById.get(nodeConnection.getRef());
                return getPointPositionGivenWindowSize(bound, node);
            }).toList();
            return new Link(way,points);
        }).toList();
    }


}
