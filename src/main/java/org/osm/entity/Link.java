package org.osm.entity;

import lombok.Data;

import java.awt.*;
import java.util.List;

public record Link(Way way, List<Point> points) {
}
