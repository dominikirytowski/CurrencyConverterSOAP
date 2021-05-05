
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
 *         &lt;element name="ConvertToNumResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "convertToNumResult"
})
@XmlRootElement(name = "ConvertToNumResponse")
public class ConvertToNumResponse {

    @XmlElement(name = "ConvertToNumResult")
    protected double convertToNumResult;

    /**
     * Gets the value of the convertToNumResult property.
     * 
     */
    public double getConvertToNumResult() {
        return convertToNumResult;
    }

    /**
     * Sets the value of the convertToNumResult property.
     * 
     */
    public void setConvertToNumResult(double value) {
        this.convertToNumResult = value;
    }

}
