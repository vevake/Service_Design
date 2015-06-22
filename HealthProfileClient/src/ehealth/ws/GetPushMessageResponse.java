
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPushMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPushMessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PushMessage" type="{http://ws.ehealth/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPushMessageResponse", propOrder = {
    "pushMessage"
})
public class GetPushMessageResponse {

    @XmlElement(name = "PushMessage")
    protected Goal pushMessage;

    /**
     * Gets the value of the pushMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getPushMessage() {
        return pushMessage;
    }

    /**
     * Sets the value of the pushMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setPushMessage(Goal value) {
        this.pushMessage = value;
    }

}
