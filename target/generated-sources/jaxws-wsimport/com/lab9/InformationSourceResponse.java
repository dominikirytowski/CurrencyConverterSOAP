
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
 *         &lt;element name="InformationSourceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "informationSourceResult"
})
@XmlRootElement(name = "InformationSourceResponse")
public class InformationSourceResponse {

    @XmlElement(name = "InformationSourceResult")
    protected String informationSourceResult;

    /**
     * Gets the value of the informationSourceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationSourceResult() {
        return informationSourceResult;
    }

    /**
     * Sets the value of the informationSourceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationSourceResult(String value) {
        this.informationSourceResult = value;
    }

}
