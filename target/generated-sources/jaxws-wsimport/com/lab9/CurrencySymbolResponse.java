
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
 *         &lt;element name="CurrencySymbolResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currencySymbolResult"
})
@XmlRootElement(name = "CurrencySymbolResponse")
public class CurrencySymbolResponse {

    @XmlElement(name = "CurrencySymbolResult")
    protected String currencySymbolResult;

    /**
     * Gets the value of the currencySymbolResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbolResult() {
        return currencySymbolResult;
    }

    /**
     * Sets the value of the currencySymbolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbolResult(String value) {
        this.currencySymbolResult = value;
    }

}
