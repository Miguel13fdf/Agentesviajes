
package serviciohotelws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciohotelws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelarReserva_QNAME = new QName("http://servicioHotelWS/", "cancelarReserva");
    private final static QName _CancelarReservaResponse_QNAME = new QName("http://servicioHotelWS/", "cancelarReservaResponse");
    private final static QName _ListarReservas_QNAME = new QName("http://servicioHotelWS/", "listarReservas");
    private final static QName _ListarReservasResponse_QNAME = new QName("http://servicioHotelWS/", "listarReservasResponse");
    private final static QName _ReservarHotel_QNAME = new QName("http://servicioHotelWS/", "reservarHotel");
    private final static QName _ReservarHotelResponse_QNAME = new QName("http://servicioHotelWS/", "reservarHotelResponse");
    private final static QName _VerificarDisponibilidad_QNAME = new QName("http://servicioHotelWS/", "verificarDisponibilidad");
    private final static QName _VerificarDisponibilidadResponse_QNAME = new QName("http://servicioHotelWS/", "verificarDisponibilidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciohotelws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelarReserva }
     * 
     */
    public CancelarReserva createCancelarReserva() {
        return new CancelarReserva();
    }

    /**
     * Create an instance of {@link CancelarReservaResponse }
     * 
     */
    public CancelarReservaResponse createCancelarReservaResponse() {
        return new CancelarReservaResponse();
    }

    /**
     * Create an instance of {@link ListarReservas }
     * 
     */
    public ListarReservas createListarReservas() {
        return new ListarReservas();
    }

    /**
     * Create an instance of {@link ListarReservasResponse }
     * 
     */
    public ListarReservasResponse createListarReservasResponse() {
        return new ListarReservasResponse();
    }

    /**
     * Create an instance of {@link ReservarHotel }
     * 
     */
    public ReservarHotel createReservarHotel() {
        return new ReservarHotel();
    }

    /**
     * Create an instance of {@link ReservarHotelResponse }
     * 
     */
    public ReservarHotelResponse createReservarHotelResponse() {
        return new ReservarHotelResponse();
    }

    /**
     * Create an instance of {@link VerificarDisponibilidad }
     * 
     */
    public VerificarDisponibilidad createVerificarDisponibilidad() {
        return new VerificarDisponibilidad();
    }

    /**
     * Create an instance of {@link VerificarDisponibilidadResponse }
     * 
     */
    public VerificarDisponibilidadResponse createVerificarDisponibilidadResponse() {
        return new VerificarDisponibilidadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "cancelarReserva")
    public JAXBElement<CancelarReserva> createCancelarReserva(CancelarReserva value) {
        return new JAXBElement<CancelarReserva>(_CancelarReserva_QNAME, CancelarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarReservaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "cancelarReservaResponse")
    public JAXBElement<CancelarReservaResponse> createCancelarReservaResponse(CancelarReservaResponse value) {
        return new JAXBElement<CancelarReservaResponse>(_CancelarReservaResponse_QNAME, CancelarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarReservas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "listarReservas")
    public JAXBElement<ListarReservas> createListarReservas(ListarReservas value) {
        return new JAXBElement<ListarReservas>(_ListarReservas_QNAME, ListarReservas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarReservasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "listarReservasResponse")
    public JAXBElement<ListarReservasResponse> createListarReservasResponse(ListarReservasResponse value) {
        return new JAXBElement<ListarReservasResponse>(_ListarReservasResponse_QNAME, ListarReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservarHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "reservarHotel")
    public JAXBElement<ReservarHotel> createReservarHotel(ReservarHotel value) {
        return new JAXBElement<ReservarHotel>(_ReservarHotel_QNAME, ReservarHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservarHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "reservarHotelResponse")
    public JAXBElement<ReservarHotelResponse> createReservarHotelResponse(ReservarHotelResponse value) {
        return new JAXBElement<ReservarHotelResponse>(_ReservarHotelResponse_QNAME, ReservarHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarDisponibilidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarDisponibilidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "verificarDisponibilidad")
    public JAXBElement<VerificarDisponibilidad> createVerificarDisponibilidad(VerificarDisponibilidad value) {
        return new JAXBElement<VerificarDisponibilidad>(_VerificarDisponibilidad_QNAME, VerificarDisponibilidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarDisponibilidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarDisponibilidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioHotelWS/", name = "verificarDisponibilidadResponse")
    public JAXBElement<VerificarDisponibilidadResponse> createVerificarDisponibilidadResponse(VerificarDisponibilidadResponse value) {
        return new JAXBElement<VerificarDisponibilidadResponse>(_VerificarDisponibilidadResponse_QNAME, VerificarDisponibilidadResponse.class, null, value);
    }

}
