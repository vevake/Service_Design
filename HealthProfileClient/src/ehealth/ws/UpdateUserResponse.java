
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUserResponse", propOrder = {
    "updateUser"
})
public class UpdateUserResponse {

    protected int updateUser;

    /**
     * Gets the value of the updateUser property.
     * 
     */
    public int getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     */
    public void setUpdateUser(int value) {
        this.updateUser = value;
    }

}
