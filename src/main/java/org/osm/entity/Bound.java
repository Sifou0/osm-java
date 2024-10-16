package org.osm.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@XmlRootElement(name = "bounds")
public final class Bound implements Serializable {
    @XmlAttribute
    private double minlat,minlon,maxlat,maxlon;
}