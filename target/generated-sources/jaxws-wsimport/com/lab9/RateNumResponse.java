
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
 *         &lt;element name="RateNumResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "rateNumResult"
})
@XmlRootElement(name = "RateNumResponse")
public class RateNumResponse {

    @XmlElement(name = "RateNumResult")
    protected double rateNumResult;

    /**
     * Gets the value of the rateNumResult property.
     * 
     */
    public double getRateNumResult() {
        return rateNumResult;
    }

    /**
     * Sets the value of the rateNumResult property.
     * 
     */
    public void setRateNumResult(double value) {
        this.rateNumResult = value;
    }

}
