
package ehealth.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasuresDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasuresDefinitionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Measures" type="{http://ws.ehealth/}measureDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasuresDefinitionResponse", propOrder = {
    "measures"
})
public class GetMeasuresDefinitionResponse {

    @XmlElement(name = "Measures")
    protected List<MeasureDefinition> measures;

    /**
     * Gets the value of the measures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureDefinition }
     * 
     * 
     */
    public List<MeasureDefinition> getMeasures() {
        if (measures == null) {
            measures = new ArrayList<MeasureDefinition>();
        }
        return this.measures;
    }

}
