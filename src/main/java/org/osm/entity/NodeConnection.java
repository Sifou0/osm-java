package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

@XmlRootElement(name = "nd")
@ToString
public final class NodeConnection {
    @XmlAttribute(name = "ref")
    @Getter
    private String ref;
}
