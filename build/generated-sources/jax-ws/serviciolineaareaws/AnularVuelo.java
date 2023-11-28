
package serviciolineaareaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnularVuelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnularVuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroVuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnularVuelo", propOrder = {
    "numeroVuelo"
})
public class AnularVuelo {

    protected String numeroVuelo;

    /**
     * Gets the value of the numeroVuelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Sets the value of the numeroVuelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVuelo(String value) {
        this.numeroVuelo = value;
    }

}
