
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
 *         &lt;element name="CurrencyServersResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "currencyServersResult"
})
@XmlRootElement(name = "CurrencyServersResponse")
public class CurrencyServersResponse {

    @XmlElement(name = "CurrencyServersResult")
    protected long currencyServersResult;

    /**
     * Gets the value of the currencyServersResult property.
     * 
     */
    public long getCurrencyServersResult() {
        return currencyServersResult;
    }

    /**
     * Sets the value of the currencyServersResult property.
     * 
     */
    public void setCurrencyServersResult(long value) {
        this.currencyServersResult = value;
    }

}
