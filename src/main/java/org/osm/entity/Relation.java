package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@ToString
@XmlRootElement(name = "relation")
public final class Relation implements Serializable {

    @XmlAttribute
    private String id;

    @XmlElement(name = "member")
    private List<Member> members;

    @XmlElement(name = "tag")
    private List<Tag> tags;
}
