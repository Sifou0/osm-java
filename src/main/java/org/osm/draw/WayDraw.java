package org.osm.draw;

import org.osm.entity.Bound;
import org.osm.entity.Link;
import org.osm.entity.Node;
import org.osm.entity.Way;
import org.osm.utils.GeoMath;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class WayDraw extends JPanel {

    private final List<Way> ways;
    private final List<Node> nodes;
    private final Bound bound;
    private final List<Link> links;

    public WayDraw(List<Way> ways, List<Node> nodes, Bound bound) {
        this.ways = ways;
        this.nodes = nodes;
        this.bound = bound;
        this.links = getLinks();
    }

    private List<Link> getLinks() {
        return GeoMath.buildLinks(ways, nodes, bound);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        this.links.forEach(
                link -> {
                    for (int i = 0; i < link.points().size() - 1; i++) {
                        g2d.drawLine((int) link.points().get(i).getX(),
                                (int) link.points().get(i).getY(),
                                (int) link.points().get(i+1).getX(),
                                (int) link.points().get(i+1).getY());
                    }
                }
        );
    }
}
