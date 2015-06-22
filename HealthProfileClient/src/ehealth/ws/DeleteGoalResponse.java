
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteGoalResponse", propOrder = {
    "deleteGoal"
})
public class DeleteGoalResponse {

    protected String deleteGoal;

    /**
     * Gets the value of the deleteGoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteGoal() {
        return deleteGoal;
    }

    /**
     * Sets the value of the deleteGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteGoal(String value) {
        this.deleteGoal = value;
    }

}
