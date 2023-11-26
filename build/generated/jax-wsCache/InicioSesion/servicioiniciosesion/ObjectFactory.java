
package servicioiniciosesion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicioiniciosesion package. 
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

    private final static QName _Regístrese_QNAME = new QName("http://servicioInicioSesion/", "Reg\u00edstrese");
    private final static QName _RegístreseResponse_QNAME = new QName("http://servicioInicioSesion/", "Reg\u00edstreseResponse");
    private final static QName _Login_QNAME = new QName("http://servicioInicioSesion/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://servicioInicioSesion/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicioiniciosesion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Regístrese }
     * 
     */
    public Regístrese createRegístrese() {
        return new Regístrese();
    }

    /**
     * Create an instance of {@link RegístreseResponse }
     * 
     */
    public RegístreseResponse createRegístreseResponse() {
        return new RegístreseResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Regístrese }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Regístrese }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "Reg\u00edstrese")
    public JAXBElement<Regístrese> createRegístrese(Regístrese value) {
        return new JAXBElement<Regístrese>(_Regístrese_QNAME, Regístrese.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegístreseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegístreseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "Reg\u00edstreseResponse")
    public JAXBElement<RegístreseResponse> createRegístreseResponse(RegístreseResponse value) {
        return new JAXBElement<RegístreseResponse>(_RegístreseResponse_QNAME, RegístreseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
