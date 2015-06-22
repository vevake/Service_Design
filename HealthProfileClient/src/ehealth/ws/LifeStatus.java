
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for lifeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lifeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LSid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureDefinition" type="{http://ws.ehealth/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://ws.ehealth/}userProfile" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lifeStatus", propOrder = {
    "dateTime",
    "lSid",
    "measureDefinition",
    "userProfile",
    "value"
})
public class LifeStatus {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "LSid")
    protected int lSid;
    protected MeasureDefinition measureDefinition;
    protected UserProfile userProfile;
    protected double value;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the lSid property.
     * 
     */
    public int getLSid() {
        return lSid;
    }

    /**
     * Sets the value of the lSid property.
     * 
     */
    public void setLSid(int value) {
        this.lSid = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfile }
     *     
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfile }
     *     
     */
    public void setUserProfile(UserProfile value) {
        this.userProfile = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
