
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
 *         &lt;element name="CurrencyPhysicalResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currencyPhysicalResult"
})
@XmlRootElement(name = "CurrencyPhysicalResponse")
public class CurrencyPhysicalResponse {

    @XmlElement(name = "CurrencyPhysicalResult")
    protected boolean currencyPhysicalResult;

    /**
     * Gets the value of the currencyPhysicalResult property.
     * 
     */
    public boolean isCurrencyPhysicalResult() {
        return currencyPhysicalResult;
    }

    /**
     * Sets the value of the currencyPhysicalResult property.
     * 
     */
    public void setCurrencyPhysicalResult(boolean value) {
        this.currencyPhysicalResult = value;
    }

}
