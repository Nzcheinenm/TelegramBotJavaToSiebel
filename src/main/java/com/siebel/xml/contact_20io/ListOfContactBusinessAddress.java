
package com.siebel.xml.contact_20io;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContact_BusinessAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContact_BusinessAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact_BusinessAddress" type="{http://www.siebel.com/xml/Contact%20IO}Contact_BusinessAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContact_BusinessAddress", propOrder = {
    "contactBusinessAddress"
})
public class ListOfContactBusinessAddress {

    @XmlElement(name = "Contact_BusinessAddress")
    protected List<ContactBusinessAddress> contactBusinessAddress;

    /**
     * Gets the value of the contactBusinessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactBusinessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactBusinessAddress }
     * 
     * 
     */
    public List<ContactBusinessAddress> getContactBusinessAddress() {
        if (contactBusinessAddress == null) {
            contactBusinessAddress = new ArrayList<ContactBusinessAddress>();
        }
        return this.contactBusinessAddress;
    }

}
