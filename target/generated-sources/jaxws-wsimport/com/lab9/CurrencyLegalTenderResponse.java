
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
 *         &lt;element name="CurrencyLegalTenderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currencyLegalTenderResult"
})
@XmlRootElement(name = "CurrencyLegalTenderResponse")
public class CurrencyLegalTenderResponse {

    @XmlElement(name = "CurrencyLegalTenderResult")
    protected boolean currencyLegalTenderResult;

    /**
     * Gets the value of the currencyLegalTenderResult property.
     * 
     */
    public boolean isCurrencyLegalTenderResult() {
        return currencyLegalTenderResult;
    }

    /**
     * Sets the value of the currencyLegalTenderResult property.
     * 
     */
    public void setCurrencyLegalTenderResult(boolean value) {
        this.currencyLegalTenderResult = value;
    }

}
