
package ehealth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="byCareGiver" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="byUserProfile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "byCareGiver",
    "byUserProfile",
    "goal",
    "goalId",
    "progress",
    "scheduleDateTime"
})
public class Goal {

    protected int byCareGiver;
    protected int byUserProfile;
    protected String goal;
    protected int goalId;
    protected String progress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDateTime;

    /**
     * Gets the value of the byCareGiver property.
     * 
     */
    public int getByCareGiver() {
        return byCareGiver;
    }

    /**
     * Sets the value of the byCareGiver property.
     * 
     */
    public void setByCareGiver(int value) {
        this.byCareGiver = value;
    }

    /**
     * Gets the value of the byUserProfile property.
     * 
     */
    public int getByUserProfile() {
        return byUserProfile;
    }

    /**
     * Sets the value of the byUserProfile property.
     * 
     */
    public void setByUserProfile(int value) {
        this.byUserProfile = value;
    }

    /**
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoal(String value) {
        this.goal = value;
    }

    /**
     * Gets the value of the goalId property.
     * 
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * Sets the value of the goalId property.
     * 
     */
    public void setGoalId(int value) {
        this.goalId = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgress(String value) {
        this.progress = value;
    }

    /**
     * Gets the value of the scheduleDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDateTime() {
        return scheduleDateTime;
    }

    /**
     * Sets the value of the scheduleDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDateTime(XMLGregorianCalendar value) {
        this.scheduleDateTime = value;
    }

}
