package org.osm.entity;


import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@ToString
@XmlRootElement(name = "osm")
public final class Osm implements Serializable {
    @XmlElement(name = "node")
    private List<Node> nodes;
    @XmlElement
    private Bound bounds;
    @XmlElement(name = "way")
    private List<Way> ways;
    @XmlElement(name = "relation")
    private List<Relation> relations;
}

