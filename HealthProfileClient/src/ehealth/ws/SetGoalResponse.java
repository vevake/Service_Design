
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="setGoal" type="{http://ws.ehealth/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setGoalResponse", propOrder = {
    "setGoal"
})
public class SetGoalResponse {

    protected Goal setGoal;

    /**
     * Gets the value of the setGoal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getSetGoal() {
        return setGoal;
    }

    /**
     * Sets the value of the setGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setSetGoal(Goal value) {
        this.setGoal = value;
    }

}
