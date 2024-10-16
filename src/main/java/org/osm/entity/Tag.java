package org.osm.entity;


import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@XmlRootElement(name = "tag")
public final class Tag implements Serializable {

    @XmlAttribute(name = "k")
    private String key;

    @XmlAttribute(name = "v")
    private String value;
}
