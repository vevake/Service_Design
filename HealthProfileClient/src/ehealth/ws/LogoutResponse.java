
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logoutResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logoutResponse", propOrder = {
    "logout"
})
public class LogoutResponse {

    protected String logout;

    /**
     * Gets the value of the logout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogout() {
        return logout;
    }

    /**
     * Sets the value of the logout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogout(String value) {
        this.logout = value;
    }

}
