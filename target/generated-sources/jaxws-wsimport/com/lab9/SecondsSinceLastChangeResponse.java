
package com.lab9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondsSinceLastChangeResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondsSinceLastChangeResult"
})
@XmlRootElement(name = "SecondsSinceLastChangeResponse")
public class SecondsSinceLastChangeResponse {

    @XmlElement(name = "SecondsSinceLastChangeResult")
    protected long secondsSinceLastChangeResult;

    /**
     * Gets the value of the secondsSinceLastChangeResult property.
     * 
     */
    public long getSecondsSinceLastChangeResult() {
        return secondsSinceLastChangeResult;
    }

    /**
     * Sets the value of the secondsSinceLastChangeResult property.
     * 
     */
    public void setSecondsSinceLastChangeResult(long value) {
        this.secondsSinceLastChangeResult = value;
    }

}
