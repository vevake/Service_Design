
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteUserResponse", propOrder = {
    "deleteUser"
})
public class DeleteUserResponse {

    protected int deleteUser;

    /**
     * Gets the value of the deleteUser property.
     * 
     */
    public int getDeleteUser() {
        return deleteUser;
    }

    /**
     * Sets the value of the deleteUser property.
     * 
     */
    public void setDeleteUser(int value) {
        this.deleteUser = value;
    }

}
