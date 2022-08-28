package ru.unclediga.examples.jersey.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.json.bind.annotation.JsonbProperty;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MyData { 
    @JsonbProperty("s1")
    private String s;
    @XmlElement(name = "s2")
    private String ss;
    private String sss;
    private String ssss;

    public MyData() {
    }

    public MyData(String s) {
        this.s = s;
        this.ss = s;        
	this.sss = s;	
	this.ssss = s;	
    }

    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = (s == null?"null":s);
    }
    public String getSs() {
        return ss;
    }
    public void setSs(String s) {
        this.ss = (s == null?"null":s);
    }    

    @JsonbProperty("s3")
    public String getSss() {
        return sss;
    }
    @JsonbProperty("s3")
    public void setSss(String s) {
        this.sss = (s == null?"null":s);
    }

    public String getSsss() {
        return ssss;
    }
    @JsonbProperty("s4")
    public void setSsss(String s) {
        this.ssss = (s == null?"null":s);
    }

    public String toJson() {
        return "{\"s\" : \"" +  s + "\"}";
    }
    @Override
    public String toString() {
        return "MyData{'" + s + "'}";
    }
}
