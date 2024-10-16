package org.osm.draw;

import org.osm.entity.Bound;
import org.osm.entity.Node;
import org.osm.utils.GeoMath;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class NodeDraw extends JPanel {

    private final List<Node> nodes;
    private final Bound bound;

    public NodeDraw(List<Node> nodes, Bound bound) {
        this.nodes = nodes;
        this.bound = bound;
    }

    private List<Point> getAllPointsFromNodes() {
        return nodes.stream().map(node -> GeoMath.getPointPositionGivenWindowSize(bound,node)).toList();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        getAllPointsFromNodes().forEach(point -> g2d.drawLine(point.x,point.y,point.x,point.y));
    }
}
