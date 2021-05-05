
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
 *         &lt;element name="CurrencyExistsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currencyExistsResult"
})
@XmlRootElement(name = "CurrencyExistsResponse")
public class CurrencyExistsResponse {

    @XmlElement(name = "CurrencyExistsResult")
    protected boolean currencyExistsResult;

    /**
     * Gets the value of the currencyExistsResult property.
     * 
     */
    public boolean isCurrencyExistsResult() {
        return currencyExistsResult;
    }

    /**
     * Sets the value of the currencyExistsResult property.
     * 
     */
    public void setCurrencyExistsResult(boolean value) {
        this.currencyExistsResult = value;
    }

}
