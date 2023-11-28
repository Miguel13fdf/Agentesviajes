
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

    private final static QName _Registro_QNAME = new QName("http://servicioInicioSesion/", "Registro");
    private final static QName _RegistroResponse_QNAME = new QName("http://servicioInicioSesion/", "RegistroResponse");
    private final static QName _AlterLoginAnswer_QNAME = new QName("http://servicioInicioSesion/", "alterLoginAnswer");
    private final static QName _AlterLoginAnswerResponse_QNAME = new QName("http://servicioInicioSesion/", "alterLoginAnswerResponse");
    private final static QName _GetSecurityQuestion_QNAME = new QName("http://servicioInicioSesion/", "getSecurityQuestion");
    private final static QName _GetSecurityQuestionResponse_QNAME = new QName("http://servicioInicioSesion/", "getSecurityQuestionResponse");
    private final static QName _Login_QNAME = new QName("http://servicioInicioSesion/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://servicioInicioSesion/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicioiniciosesion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link RegistroResponse }
     * 
     */
    public RegistroResponse createRegistroResponse() {
        return new RegistroResponse();
    }

    /**
     * Create an instance of {@link AlterLoginAnswer }
     * 
     */
    public AlterLoginAnswer createAlterLoginAnswer() {
        return new AlterLoginAnswer();
    }

    /**
     * Create an instance of {@link AlterLoginAnswerResponse }
     * 
     */
    public AlterLoginAnswerResponse createAlterLoginAnswerResponse() {
        return new AlterLoginAnswerResponse();
    }

    /**
     * Create an instance of {@link GetSecurityQuestion }
     * 
     */
    public GetSecurityQuestion createGetSecurityQuestion() {
        return new GetSecurityQuestion();
    }

    /**
     * Create an instance of {@link GetSecurityQuestionResponse }
     * 
     */
    public GetSecurityQuestionResponse createGetSecurityQuestionResponse() {
        return new GetSecurityQuestionResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "Registro")
    public JAXBElement<Registro> createRegistro(Registro value) {
        return new JAXBElement<Registro>(_Registro_QNAME, Registro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "RegistroResponse")
    public JAXBElement<RegistroResponse> createRegistroResponse(RegistroResponse value) {
        return new JAXBElement<RegistroResponse>(_RegistroResponse_QNAME, RegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterLoginAnswer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterLoginAnswer }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "alterLoginAnswer")
    public JAXBElement<AlterLoginAnswer> createAlterLoginAnswer(AlterLoginAnswer value) {
        return new JAXBElement<AlterLoginAnswer>(_AlterLoginAnswer_QNAME, AlterLoginAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterLoginAnswerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterLoginAnswerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "alterLoginAnswerResponse")
    public JAXBElement<AlterLoginAnswerResponse> createAlterLoginAnswerResponse(AlterLoginAnswerResponse value) {
        return new JAXBElement<AlterLoginAnswerResponse>(_AlterLoginAnswerResponse_QNAME, AlterLoginAnswerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSecurityQuestion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSecurityQuestion }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "getSecurityQuestion")
    public JAXBElement<GetSecurityQuestion> createGetSecurityQuestion(GetSecurityQuestion value) {
        return new JAXBElement<GetSecurityQuestion>(_GetSecurityQuestion_QNAME, GetSecurityQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSecurityQuestionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSecurityQuestionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicioInicioSesion/", name = "getSecurityQuestionResponse")
    public JAXBElement<GetSecurityQuestionResponse> createGetSecurityQuestionResponse(GetSecurityQuestionResponse value) {
        return new JAXBElement<GetSecurityQuestionResponse>(_GetSecurityQuestionResponse_QNAME, GetSecurityQuestionResponse.class, null, value);
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
