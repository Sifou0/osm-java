package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@XmlRootElement(name = "member")
public final class Member implements Serializable {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String ref;
    @XmlAttribute
    private String role;
}
