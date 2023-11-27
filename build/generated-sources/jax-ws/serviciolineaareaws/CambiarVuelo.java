
package serviciolineaareaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarVuelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad numeroVuelo.
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
     * Define el valor de la propiedad numeroVuelo.
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
     * Obtiene el valor de la propiedad nuevaFecha.
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
     * Define el valor de la propiedad nuevaFecha.
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
     * Obtiene el valor de la propiedad nuevaHoraSalida.
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
     * Define el valor de la propiedad nuevaHoraSalida.
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
     * Obtiene el valor de la propiedad nuevaHoraLlegada.
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
     * Define el valor de la propiedad nuevaHoraLlegada.
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
