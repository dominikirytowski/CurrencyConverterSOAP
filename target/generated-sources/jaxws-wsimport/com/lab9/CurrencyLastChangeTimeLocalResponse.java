
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
 *         &lt;element name="CurrencyLastChangeTimeLocalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currencyLastChangeTimeLocalResult"
})
@XmlRootElement(name = "CurrencyLastChangeTimeLocalResponse")
public class CurrencyLastChangeTimeLocalResponse {

    @XmlElement(name = "CurrencyLastChangeTimeLocalResult")
    protected String currencyLastChangeTimeLocalResult;

    /**
     * Gets the value of the currencyLastChangeTimeLocalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyLastChangeTimeLocalResult() {
        return currencyLastChangeTimeLocalResult;
    }

    /**
     * Sets the value of the currencyLastChangeTimeLocalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyLastChangeTimeLocalResult(String value) {
        this.currencyLastChangeTimeLocalResult = value;
    }

}
