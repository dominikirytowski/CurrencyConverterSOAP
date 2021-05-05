
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
 *         &lt;element name="CurrencySubUnitResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currencySubUnitResult"
})
@XmlRootElement(name = "CurrencySubUnitResponse")
public class CurrencySubUnitResponse {

    @XmlElement(name = "CurrencySubUnitResult")
    protected boolean currencySubUnitResult;

    /**
     * Gets the value of the currencySubUnitResult property.
     * 
     */
    public boolean isCurrencySubUnitResult() {
        return currencySubUnitResult;
    }

    /**
     * Sets the value of the currencySubUnitResult property.
     * 
     */
    public void setCurrencySubUnitResult(boolean value) {
        this.currencySubUnitResult = value;
    }

}
