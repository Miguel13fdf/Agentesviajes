
package serviciolineaareaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CambiarVuelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CambiarVuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroVuelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevaFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevaHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CambiarVuelo", propOrder = {
    "numeroVuelo",
    "nuevaFecha",
    "nuevaHora"
})
public class CambiarVuelo {

    protected int numeroVuelo;
    protected String nuevaFecha;
    protected String nuevaHora;

    /**
     * Obtiene el valor de la propiedad numeroVuelo.
     * 
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Define el valor de la propiedad numeroVuelo.
     * 
     */
    public void setNumeroVuelo(int value) {
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
     * Obtiene el valor de la propiedad nuevaHora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaHora() {
        return nuevaHora;
    }

    /**
     * Define el valor de la propiedad nuevaHora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaHora(String value) {
        this.nuevaHora = value;
    }

}
