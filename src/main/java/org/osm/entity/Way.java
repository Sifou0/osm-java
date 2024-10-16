package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public final class Way implements Serializable {

    @XmlAttribute
    private String id;

    @XmlElement(name = "nd")
    @Getter
    private List<NodeConnection> nodeConnectionList;

    @XmlElement(name = "tag")
    @Getter
    private List<Tag> tags;
}
