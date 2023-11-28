
package serviciolineaareaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for horarioVuelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="horarioVuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idHorario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horarioVuelo", propOrder = {
    "fecha",
    "horaLlegada",
    "horaSalida",
    "idHorario"
})
public class HorarioVuelo {

    protected String fecha;
    protected String horaLlegada;
    protected String horaSalida;
    protected String idHorario;

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the horaLlegada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * Sets the value of the horaLlegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraLlegada(String value) {
        this.horaLlegada = value;
    }

    /**
     * Gets the value of the horaSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * Sets the value of the horaSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSalida(String value) {
        this.horaSalida = value;
    }

    /**
     * Gets the value of the idHorario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdHorario() {
        return idHorario;
    }

    /**
     * Sets the value of the idHorario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdHorario(String value) {
        this.idHorario = value;
    }

}
