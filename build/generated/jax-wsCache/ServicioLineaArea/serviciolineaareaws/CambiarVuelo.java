
package serviciolineaareaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cambiarVuelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cambiarVuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroVuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevaFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevaHoraSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevaHoraLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarVuelo", propOrder = {
    "numeroVuelo",
    "nuevaFecha",
    "nuevaHoraSalida",
    "nuevaHoraLlegada"
})
public class CambiarVuelo {

    protected String numeroVuelo;
    protected String nuevaFecha;
    protected String nuevaHoraSalida;
    protected String nuevaHoraLlegada;

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

    /**
     * Gets the value of the nuevaFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaFecha() {
        return nuevaFecha;
    }

    /**
     * Sets the value of the nuevaFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaFecha(String value) {
        this.nuevaFecha = value;
    }

    /**
     * Gets the value of the nuevaHoraSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaHoraSalida() {
        return nuevaHoraSalida;
    }

    /**
     * Sets the value of the nuevaHoraSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaHoraSalida(String value) {
        this.nuevaHoraSalida = value;
    }

    /**
     * Gets the value of the nuevaHoraLlegada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaHoraLlegada() {
        return nuevaHoraLlegada;
    }

    /**
     * Sets the value of the nuevaHoraLlegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaHoraLlegada(String value) {
        this.nuevaHoraLlegada = value;
    }

}
