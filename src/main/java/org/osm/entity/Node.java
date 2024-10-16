package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
@Getter
@XmlRootElement(name = "node")
public final class Node implements Serializable {

    @XmlAttribute
    private String id;

    @XmlElement(name = "tag")
    private List<Tag> children;

    @XmlAttribute
    private Double lon;

    @XmlAttribute
    private Double lat;
}
