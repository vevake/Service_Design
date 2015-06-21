
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoalUpdateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoalUpdate" type="{http://ws.ehealth/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoalUpdateResponse", propOrder = {
    "goalUpdate"
})
public class GoalUpdateResponse {

    @XmlElement(name = "GoalUpdate")
    protected Goal goalUpdate;

    /**
     * Gets the value of the goalUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoalUpdate() {
        return goalUpdate;
    }

    /**
     * Sets the value of the goalUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoalUpdate(Goal value) {
        this.goalUpdate = value;
    }

}
