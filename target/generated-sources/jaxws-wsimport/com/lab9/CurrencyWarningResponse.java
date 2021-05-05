
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
 *         &lt;element name="CurrencyWarningResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currencyWarningResult"
})
@XmlRootElement(name = "CurrencyWarningResponse")
public class CurrencyWarningResponse {

    @XmlElement(name = "CurrencyWarningResult")
    protected boolean currencyWarningResult;

    /**
     * Gets the value of the currencyWarningResult property.
     * 
     */
    public boolean isCurrencyWarningResult() {
        return currencyWarningResult;
    }

    /**
     * Sets the value of the currencyWarningResult property.
     * 
     */
    public void setCurrencyWarningResult(boolean value) {
        this.currencyWarningResult = value;
    }

}
