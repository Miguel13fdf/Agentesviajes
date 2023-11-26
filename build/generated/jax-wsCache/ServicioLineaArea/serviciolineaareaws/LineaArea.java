
package serviciolineaareaws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lineaArea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lineaArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horarios" type="{http://servicioLineaAreaWS/}horarioVuelo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idLineaAerea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineaArea", propOrder = {
    "horarios",
    "idLineaAerea",
    "nombre"
})
public class LineaArea {

    @XmlElement(nillable = true)
    protected List<HorarioVuelo> horarios;
    protected int idLineaAerea;
    protected String nombre;

    /**
     * Gets the value of the horarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioVuelo }
     * 
     * 
     */
    public List<HorarioVuelo> getHorarios() {
        if (horarios == null) {
            horarios = new ArrayList<HorarioVuelo>();
        }
        return this.horarios;
    }

    /**
     * Obtiene el valor de la propiedad idLineaAerea.
     * 
     */
    public int getIdLineaAerea() {
        return idLineaAerea;
    }

    /**
     * Define el valor de la propiedad idLineaAerea.
     * 
     */
    public void setIdLineaAerea(int value) {
        this.idLineaAerea = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
