
package serviciolineaareaws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciolineaareaws package. 
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

    private final static QName _AnularVuelo_QNAME = new QName("http://servicioLineaAreaWS/", "AnularVuelo");
    private final static QName _AnularVueloResponse_QNAME = new QName("http://servicioLineaAreaWS/", "AnularVueloResponse");
    private final static QName _BuscarLineaArea_QNAME = new QName("http://servicioLineaAreaWS/", "BuscarLineaArea");
    private final static QName _BuscarLineaAreaResponse_QNAME = new QName("http://servicioLineaAreaWS/", "BuscarLineaAreaResponse");
    private final static QName _BuscarVuelos_QNAME = new QName("http://servicioLineaAreaWS/", "BuscarVuelos");
    private final static QName _BuscarVuelosResponse_QNAME = new QName("http://servicioLineaAreaWS/", "BuscarVuelosResponse");
    private final static QName _ListarHorarios_QNAME = new QName("http://servicioLineaAreaWS/", "ListarHorarios");
    private final static QName _ListarHorariosResponse_QNAME = new QName("http://servicioLineaAreaWS/", "ListarHorariosResponse");
    private final static QName _ListarLieneasAereas_QNAME = new QName("http://servicioLineaAreaWS/", "ListarLieneasAereas");
    private final static QName _ListarLieneasAereasResponse_QNAME = new QName("http://servicioLineaAreaWS/", "ListarLieneasAereasResponse");
    private final static QName _RegistroHorario_QNAME = new QName("http://servicioLineaAreaWS/", "RegistroHorario");
    private final static QName _RegistroHorarioResponse_QNAME = new QName("http://servicioLineaAreaWS/", "RegistroHorarioResponse");
    private final static QName _RegistroLineaAerea_QNAME = new QName("http://servicioLineaAreaWS/", "RegistroLineaAerea");
    private final static QName _RegistroLineaAereaResponse_QNAME = new QName("http://servicioLineaAreaWS/", "RegistroLineaAereaResponse");
    private final static QName _CambiarVuelo_QNAME = new QName("http://servicioLineaAreaWS/", "cambiarVuelo");
    private final static QName _CambiarVueloResponse_QNAME = new QName("http://servicioLineaAreaWS/", "cambiarVueloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciolineaareaws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnularVuelo }
     * 
     */
    public AnularVuelo createAnularVuelo() {
        return new AnularVuelo();
    }

    /**
     * Create an instance of {@link AnularVueloResponse }
     * 
     */
    public AnularVueloResponse createAnularVueloResponse() {
        return new AnularVueloResponse();
    }

    /**
     * Create an instance of {@link BuscarLineaArea }
     * 
     */
    public BuscarLineaArea createBuscarLineaArea() {
        return new BuscarLineaArea();
    }

    /**
     * Create an instance of {@link BuscarLineaAreaResponse }
     * 
     */
    public BuscarLineaAreaResponse createBuscarLineaAreaResponse() {
        return new BuscarLineaAreaResponse();
    }

    /**
     * Create an instance of {@link BuscarVuelos }
     * 
     */
    public BuscarVuelos createBuscarVuelos() {
        return new BuscarVuelos();
    }

    /**
     * Create an instance of {@link BuscarVuelosResponse }
     * 
     */
    public BuscarVuelosResponse createBuscarVuelosResponse() {
        return new BuscarVuelosResponse();
    }

    /**
     * Create an instance of {@link ListarHorarios }
     * 
     */
    public ListarHorarios createListarHorarios() {
        return new ListarHorarios();
    }

    /**
     * Create an instance of {@link ListarHorariosResponse }
     * 
     */
    public ListarHorariosResponse createListarHorariosResponse() {
        return new ListarHorariosResponse();
    }

    /**
     * Create an instance of {@link ListarLieneasAereas }
     * 
     */
    public ListarLieneasAereas createListarLieneasAereas() {
        return new ListarLieneasAereas();
    }

    /**
     * Create an instance of {@link ListarLieneasAereasResponse }
     * 
     */
    public ListarLieneasAereasResponse createListarLieneasAereasResponse() {
        return new ListarLieneasAereasResponse();
    }

    /**
     * Create an instance of {@link RegistroHorario }
     * 
     */
    public RegistroHorario createRegistroHorario() {
        return new RegistroHorario();
    }

    /**
     * Create an instance of {@link RegistroHorarioResponse }
     * 
     */
    public RegistroHorarioResponse createRegistroHorarioResponse() {
        return new RegistroHorarioResponse();
    }

    /**
     * Create an instance of {@link RegistroLineaAerea }
     * 
     */
    public RegistroLineaAerea createRegistroLineaAerea() {
        return new RegistroLineaAerea();
    }

    /**
     * Create an instance of {@link RegistroLineaAereaResponse }
     * 
     */
    public RegistroLineaAereaResponse createRegistroLineaAereaResponse() {
        return new RegistroLineaAereaResponse();
    }

    /**
     * Create an instance of {@link CambiarVuelo }
     * 
     */
    public CambiarVuelo createCambiarVuelo() {
        return new CambiarVuelo();
    }

    /**
     * Create an instance of {@link CambiarVueloResponse }
     * 
     */
    public CambiarVueloResponse createCambiarVueloResponse() {
        return new CambiarVueloResponse();
    }

    /**
     * Create an instance of {@link HorarioVuelo }
     * 
     */
    public HorarioVuelo createHorarioVuelo() {
        return new HorarioVuelo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularVuelo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularVuelo }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "AnularVuelo")
    public JAXBElement<AnularVuelo> createAnularVuelo(AnularVuelo value) {
        return new JAXBElement<AnularVuelo>(_AnularVuelo_QNAME, AnularVuelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularVueloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularVueloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "AnularVueloResponse")
    public JAXBElement<AnularVueloResponse> createAnularVueloResponse(AnularVueloResponse value) {
        return new JAXBElement<AnularVueloResponse>(_AnularVueloResponse_QNAME, AnularVueloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLineaArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarLineaArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "BuscarLineaArea")
    public JAXBElement<BuscarLineaArea> createBuscarLineaArea(BuscarLineaArea value) {
        return new JAXBElement<BuscarLineaArea>(_BuscarLineaArea_QNAME, BuscarLineaArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLineaAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarLineaAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "BuscarLineaAreaResponse")
    public JAXBElement<BuscarLineaAreaResponse> createBuscarLineaAreaResponse(BuscarLineaAreaResponse value) {
        return new JAXBElement<BuscarLineaAreaResponse>(_BuscarLineaAreaResponse_QNAME, BuscarLineaAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVuelos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarVuelos }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "BuscarVuelos")
    public JAXBElement<BuscarVuelos> createBuscarVuelos(BuscarVuelos value) {
        return new JAXBElement<BuscarVuelos>(_BuscarVuelos_QNAME, BuscarVuelos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVuelosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarVuelosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "BuscarVuelosResponse")
    public JAXBElement<BuscarVuelosResponse> createBuscarVuelosResponse(BuscarVuelosResponse value) {
        return new JAXBElement<BuscarVuelosResponse>(_BuscarVuelosResponse_QNAME, BuscarVuelosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHorarios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarHorarios }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "ListarHorarios")
    public JAXBElement<ListarHorarios> createListarHorarios(ListarHorarios value) {
        return new JAXBElement<ListarHorarios>(_ListarHorarios_QNAME, ListarHorarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHorariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarHorariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "ListarHorariosResponse")
    public JAXBElement<ListarHorariosResponse> createListarHorariosResponse(ListarHorariosResponse value) {
        return new JAXBElement<ListarHorariosResponse>(_ListarHorariosResponse_QNAME, ListarHorariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLieneasAereas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLieneasAereas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "ListarLieneasAereas")
    public JAXBElement<ListarLieneasAereas> createListarLieneasAereas(ListarLieneasAereas value) {
        return new JAXBElement<ListarLieneasAereas>(_ListarLieneasAereas_QNAME, ListarLieneasAereas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLieneasAereasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLieneasAereasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "ListarLieneasAereasResponse")
    public JAXBElement<ListarLieneasAereasResponse> createListarLieneasAereasResponse(ListarLieneasAereasResponse value) {
        return new JAXBElement<ListarLieneasAereasResponse>(_ListarLieneasAereasResponse_QNAME, ListarLieneasAereasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroHorario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroHorario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "RegistroHorario")
    public JAXBElement<RegistroHorario> createRegistroHorario(RegistroHorario value) {
        return new JAXBElement<RegistroHorario>(_RegistroHorario_QNAME, RegistroHorario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroHorarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroHorarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "RegistroHorarioResponse")
    public JAXBElement<RegistroHorarioResponse> createRegistroHorarioResponse(RegistroHorarioResponse value) {
        return new JAXBElement<RegistroHorarioResponse>(_RegistroHorarioResponse_QNAME, RegistroHorarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroLineaAerea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroLineaAerea }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "RegistroLineaAerea")
    public JAXBElement<RegistroLineaAerea> createRegistroLineaAerea(RegistroLineaAerea value) {
        return new JAXBElement<RegistroLineaAerea>(_RegistroLineaAerea_QNAME, RegistroLineaAerea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroLineaAereaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroLineaAereaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "RegistroLineaAereaResponse")
    public JAXBElement<RegistroLineaAereaResponse> createRegistroLineaAereaResponse(RegistroLineaAereaResponse value) {
        return new JAXBElement<RegistroLineaAereaResponse>(_RegistroLineaAereaResponse_QNAME, RegistroLineaAereaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarVuelo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarVuelo }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "cambiarVuelo")
    public JAXBElement<CambiarVuelo> createCambiarVuelo(CambiarVuelo value) {
        return new JAXBElement<CambiarVuelo>(_CambiarVuelo_QNAME, CambiarVuelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarVueloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarVueloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioLineaAreaWS/", name = "cambiarVueloResponse")
    public JAXBElement<CambiarVueloResponse> createCambiarVueloResponse(CambiarVueloResponse value) {
        return new JAXBElement<CambiarVueloResponse>(_CambiarVueloResponse_QNAME, CambiarVueloResponse.class, null, value);
    }

}
