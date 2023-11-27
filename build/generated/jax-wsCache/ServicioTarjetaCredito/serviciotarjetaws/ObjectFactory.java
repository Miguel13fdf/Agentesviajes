
package serviciotarjetaws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciotarjetaws package. 
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

    private final static QName _ActualizarTarjeta_QNAME = new QName("http://servicioTarjetaWS/", "ActualizarTarjeta");
    private final static QName _ActualizarTarjetaResponse_QNAME = new QName("http://servicioTarjetaWS/", "ActualizarTarjetaResponse");
    private final static QName _RegistroTarjeta_QNAME = new QName("http://servicioTarjetaWS/", "RegistroTarjeta");
    private final static QName _RegistroTarjetaResponse_QNAME = new QName("http://servicioTarjetaWS/", "RegistroTarjetaResponse");
    private final static QName _ConsultarSaldoDisponible_QNAME = new QName("http://servicioTarjetaWS/", "consultarSaldoDisponible");
    private final static QName _ConsultarSaldoDisponibleResponse_QNAME = new QName("http://servicioTarjetaWS/", "consultarSaldoDisponibleResponse");
    private final static QName _ObtenerHistorialTarjeta_QNAME = new QName("http://servicioTarjetaWS/", "obtenerHistorialTarjeta");
    private final static QName _ObtenerHistorialTarjetaResponse_QNAME = new QName("http://servicioTarjetaWS/", "obtenerHistorialTarjetaResponse");
    private final static QName _RealizartTransaccion_QNAME = new QName("http://servicioTarjetaWS/", "realizartTransaccion");
    private final static QName _RealizartTransaccionResponse_QNAME = new QName("http://servicioTarjetaWS/", "realizartTransaccionResponse");
    private final static QName _RetirarDinero_QNAME = new QName("http://servicioTarjetaWS/", "retirarDinero");
    private final static QName _RetirarDineroResponse_QNAME = new QName("http://servicioTarjetaWS/", "retirarDineroResponse");
    private final static QName _ValidarFechaVencimiento_QNAME = new QName("http://servicioTarjetaWS/", "validarFechaVencimiento");
    private final static QName _ValidarFechaVencimientoResponse_QNAME = new QName("http://servicioTarjetaWS/", "validarFechaVencimientoResponse");
    private final static QName _ValidarTarjetaCredito_QNAME = new QName("http://servicioTarjetaWS/", "validarTarjetaCredito");
    private final static QName _ValidarTarjetaCreditoResponse_QNAME = new QName("http://servicioTarjetaWS/", "validarTarjetaCreditoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciotarjetaws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarTarjeta }
     * 
     */
    public ActualizarTarjeta createActualizarTarjeta() {
        return new ActualizarTarjeta();
    }

    /**
     * Create an instance of {@link ActualizarTarjetaResponse }
     * 
     */
    public ActualizarTarjetaResponse createActualizarTarjetaResponse() {
        return new ActualizarTarjetaResponse();
    }

    /**
     * Create an instance of {@link RegistroTarjeta }
     * 
     */
    public RegistroTarjeta createRegistroTarjeta() {
        return new RegistroTarjeta();
    }

    /**
     * Create an instance of {@link RegistroTarjetaResponse }
     * 
     */
    public RegistroTarjetaResponse createRegistroTarjetaResponse() {
        return new RegistroTarjetaResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldoDisponible }
     * 
     */
    public ConsultarSaldoDisponible createConsultarSaldoDisponible() {
        return new ConsultarSaldoDisponible();
    }

    /**
     * Create an instance of {@link ConsultarSaldoDisponibleResponse }
     * 
     */
    public ConsultarSaldoDisponibleResponse createConsultarSaldoDisponibleResponse() {
        return new ConsultarSaldoDisponibleResponse();
    }

    /**
     * Create an instance of {@link ObtenerHistorialTarjeta }
     * 
     */
    public ObtenerHistorialTarjeta createObtenerHistorialTarjeta() {
        return new ObtenerHistorialTarjeta();
    }

    /**
     * Create an instance of {@link ObtenerHistorialTarjetaResponse }
     * 
     */
    public ObtenerHistorialTarjetaResponse createObtenerHistorialTarjetaResponse() {
        return new ObtenerHistorialTarjetaResponse();
    }

    /**
     * Create an instance of {@link RealizartTransaccion }
     * 
     */
    public RealizartTransaccion createRealizartTransaccion() {
        return new RealizartTransaccion();
    }

    /**
     * Create an instance of {@link RealizartTransaccionResponse }
     * 
     */
    public RealizartTransaccionResponse createRealizartTransaccionResponse() {
        return new RealizartTransaccionResponse();
    }

    /**
     * Create an instance of {@link RetirarDinero }
     * 
     */
    public RetirarDinero createRetirarDinero() {
        return new RetirarDinero();
    }

    /**
     * Create an instance of {@link RetirarDineroResponse }
     * 
     */
    public RetirarDineroResponse createRetirarDineroResponse() {
        return new RetirarDineroResponse();
    }

    /**
     * Create an instance of {@link ValidarFechaVencimiento }
     * 
     */
    public ValidarFechaVencimiento createValidarFechaVencimiento() {
        return new ValidarFechaVencimiento();
    }

    /**
     * Create an instance of {@link ValidarFechaVencimientoResponse }
     * 
     */
    public ValidarFechaVencimientoResponse createValidarFechaVencimientoResponse() {
        return new ValidarFechaVencimientoResponse();
    }

    /**
     * Create an instance of {@link ValidarTarjetaCredito }
     * 
     */
    public ValidarTarjetaCredito createValidarTarjetaCredito() {
        return new ValidarTarjetaCredito();
    }

    /**
     * Create an instance of {@link ValidarTarjetaCreditoResponse }
     * 
     */
    public ValidarTarjetaCreditoResponse createValidarTarjetaCreditoResponse() {
        return new ValidarTarjetaCreditoResponse();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "ActualizarTarjeta")
    public JAXBElement<ActualizarTarjeta> createActualizarTarjeta(ActualizarTarjeta value) {
        return new JAXBElement<ActualizarTarjeta>(_ActualizarTarjeta_QNAME, ActualizarTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTarjetaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarTarjetaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "ActualizarTarjetaResponse")
    public JAXBElement<ActualizarTarjetaResponse> createActualizarTarjetaResponse(ActualizarTarjetaResponse value) {
        return new JAXBElement<ActualizarTarjetaResponse>(_ActualizarTarjetaResponse_QNAME, ActualizarTarjetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "RegistroTarjeta")
    public JAXBElement<RegistroTarjeta> createRegistroTarjeta(RegistroTarjeta value) {
        return new JAXBElement<RegistroTarjeta>(_RegistroTarjeta_QNAME, RegistroTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroTarjetaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroTarjetaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "RegistroTarjetaResponse")
    public JAXBElement<RegistroTarjetaResponse> createRegistroTarjetaResponse(RegistroTarjetaResponse value) {
        return new JAXBElement<RegistroTarjetaResponse>(_RegistroTarjetaResponse_QNAME, RegistroTarjetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoDisponible }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoDisponible }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "consultarSaldoDisponible")
    public JAXBElement<ConsultarSaldoDisponible> createConsultarSaldoDisponible(ConsultarSaldoDisponible value) {
        return new JAXBElement<ConsultarSaldoDisponible>(_ConsultarSaldoDisponible_QNAME, ConsultarSaldoDisponible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoDisponibleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoDisponibleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "consultarSaldoDisponibleResponse")
    public JAXBElement<ConsultarSaldoDisponibleResponse> createConsultarSaldoDisponibleResponse(ConsultarSaldoDisponibleResponse value) {
        return new JAXBElement<ConsultarSaldoDisponibleResponse>(_ConsultarSaldoDisponibleResponse_QNAME, ConsultarSaldoDisponibleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHistorialTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHistorialTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "obtenerHistorialTarjeta")
    public JAXBElement<ObtenerHistorialTarjeta> createObtenerHistorialTarjeta(ObtenerHistorialTarjeta value) {
        return new JAXBElement<ObtenerHistorialTarjeta>(_ObtenerHistorialTarjeta_QNAME, ObtenerHistorialTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHistorialTarjetaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHistorialTarjetaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "obtenerHistorialTarjetaResponse")
    public JAXBElement<ObtenerHistorialTarjetaResponse> createObtenerHistorialTarjetaResponse(ObtenerHistorialTarjetaResponse value) {
        return new JAXBElement<ObtenerHistorialTarjetaResponse>(_ObtenerHistorialTarjetaResponse_QNAME, ObtenerHistorialTarjetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizartTransaccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealizartTransaccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "realizartTransaccion")
    public JAXBElement<RealizartTransaccion> createRealizartTransaccion(RealizartTransaccion value) {
        return new JAXBElement<RealizartTransaccion>(_RealizartTransaccion_QNAME, RealizartTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizartTransaccionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealizartTransaccionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "realizartTransaccionResponse")
    public JAXBElement<RealizartTransaccionResponse> createRealizartTransaccionResponse(RealizartTransaccionResponse value) {
        return new JAXBElement<RealizartTransaccionResponse>(_RealizartTransaccionResponse_QNAME, RealizartTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarDinero }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarDinero }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "retirarDinero")
    public JAXBElement<RetirarDinero> createRetirarDinero(RetirarDinero value) {
        return new JAXBElement<RetirarDinero>(_RetirarDinero_QNAME, RetirarDinero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarDineroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarDineroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "retirarDineroResponse")
    public JAXBElement<RetirarDineroResponse> createRetirarDineroResponse(RetirarDineroResponse value) {
        return new JAXBElement<RetirarDineroResponse>(_RetirarDineroResponse_QNAME, RetirarDineroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarFechaVencimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarFechaVencimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "validarFechaVencimiento")
    public JAXBElement<ValidarFechaVencimiento> createValidarFechaVencimiento(ValidarFechaVencimiento value) {
        return new JAXBElement<ValidarFechaVencimiento>(_ValidarFechaVencimiento_QNAME, ValidarFechaVencimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarFechaVencimientoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarFechaVencimientoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "validarFechaVencimientoResponse")
    public JAXBElement<ValidarFechaVencimientoResponse> createValidarFechaVencimientoResponse(ValidarFechaVencimientoResponse value) {
        return new JAXBElement<ValidarFechaVencimientoResponse>(_ValidarFechaVencimientoResponse_QNAME, ValidarFechaVencimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarTarjetaCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarTarjetaCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "validarTarjetaCredito")
    public JAXBElement<ValidarTarjetaCredito> createValidarTarjetaCredito(ValidarTarjetaCredito value) {
        return new JAXBElement<ValidarTarjetaCredito>(_ValidarTarjetaCredito_QNAME, ValidarTarjetaCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarTarjetaCreditoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarTarjetaCreditoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioTarjetaWS/", name = "validarTarjetaCreditoResponse")
    public JAXBElement<ValidarTarjetaCreditoResponse> createValidarTarjetaCreditoResponse(ValidarTarjetaCreditoResponse value) {
        return new JAXBElement<ValidarTarjetaCreditoResponse>(_ValidarTarjetaCreditoResponse_QNAME, ValidarTarjetaCreditoResponse.class, null, value);
    }

}
