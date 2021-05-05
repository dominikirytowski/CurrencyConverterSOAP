
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
 *         &lt;element name="CurrencySecondsSinceLastChangeResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "currencySecondsSinceLastChangeResult"
})
@XmlRootElement(name = "CurrencySecondsSinceLastChangeResponse")
public class CurrencySecondsSinceLastChangeResponse {

    @XmlElement(name = "CurrencySecondsSinceLastChangeResult")
    protected long currencySecondsSinceLastChangeResult;

    /**
     * Gets the value of the currencySecondsSinceLastChangeResult property.
     * 
     */
    public long getCurrencySecondsSinceLastChangeResult() {
        return currencySecondsSinceLastChangeResult;
    }

    /**
     * Sets the value of the currencySecondsSinceLastChangeResult property.
     * 
     */
    public void setCurrencySecondsSinceLastChangeResult(long value) {
        this.currencySecondsSinceLastChangeResult = value;
    }

}
