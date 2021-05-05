
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
 *         &lt;element name="CurrencyHitsResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "currencyHitsResult"
})
@XmlRootElement(name = "CurrencyHitsResponse")
public class CurrencyHitsResponse {

    @XmlElement(name = "CurrencyHitsResult")
    protected long currencyHitsResult;

    /**
     * Gets the value of the currencyHitsResult property.
     * 
     */
    public long getCurrencyHitsResult() {
        return currencyHitsResult;
    }

    /**
     * Sets the value of the currencyHitsResult property.
     * 
     */
    public void setCurrencyHitsResult(long value) {
        this.currencyHitsResult = value;
    }

}
