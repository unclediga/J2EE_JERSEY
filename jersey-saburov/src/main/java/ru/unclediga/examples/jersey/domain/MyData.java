package ru.unclediga.examples.jersey.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MyData {
    private String s;

    public MyData() {
    }

    public MyData(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyData{'" + s + "'}";
    }

    public String toJson() {
        return "{\"s\" : \"" +  s + "\"}";
    }
}
