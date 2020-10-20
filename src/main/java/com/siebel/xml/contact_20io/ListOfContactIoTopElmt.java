
package com.siebel.xml.contact_20io;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContactIoTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContactIoTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfContactIo" type="{http://www.siebel.com/xml/Contact%20IO}ListOfContactIo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContactIoTopElmt", propOrder = {
    "listOfContactIo"
})
public class ListOfContactIoTopElmt {

    @XmlElement(name = "ListOfContactIo", required = true)
    protected ListOfContactIo listOfContactIo;

    /**
     * Gets the value of the listOfContactIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactIo }
     *     
     */
    public ListOfContactIo getListOfContactIo() {
        return listOfContactIo;
    }

    /**
     * Sets the value of the listOfContactIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactIo }
     *     
     */
    public void setListOfContactIo(ListOfContactIo value) {
        this.listOfContactIo = value;
    }

}
