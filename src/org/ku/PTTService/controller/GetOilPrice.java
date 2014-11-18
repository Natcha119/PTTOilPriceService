
package org.ku.PTTService.controller;

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
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MM" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="YYYY" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "language",
    "dd",
    "mm",
    "yyyy"
})
@XmlRootElement(name = "GetOilPrice")
public class GetOilPrice {

    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "DD")
    protected short dd;
    @XmlElement(name = "MM")
    protected short mm;
    @XmlElement(name = "YYYY")
    protected short yyyy;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the dd property.
     * 
     */
    public short getDD() {
        return dd;
    }

    /**
     * Sets the value of the dd property.
     * 
     */
    public void setDD(short value) {
        this.dd = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     */
    public short getMM() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     */
    public void setMM(short value) {
        this.mm = value;
    }

    /**
     * Gets the value of the yyyy property.
     * 
     */
    public short getYYYY() {
        return yyyy;
    }

    /**
     * Sets the value of the yyyy property.
     * 
     */
    public void setYYYY(short value) {
        this.yyyy = value;
    }

}
