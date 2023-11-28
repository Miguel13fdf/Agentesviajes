
package servicioiniciosesion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InicioSesion", targetNamespace = "http://servicioInicioSesion/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InicioSesion {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.LoginResponse")
    @Action(input = "http://servicioInicioSesion/InicioSesion/loginRequest", output = "http://servicioInicioSesion/InicioSesion/loginResponse")
    public String login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSecurityQuestion", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.GetSecurityQuestion")
    @ResponseWrapper(localName = "getSecurityQuestionResponse", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.GetSecurityQuestionResponse")
    @Action(input = "http://servicioInicioSesion/InicioSesion/getSecurityQuestionRequest", output = "http://servicioInicioSesion/InicioSesion/getSecurityQuestionResponse")
    public String getSecurityQuestion(
        @WebParam(name = "user", targetNamespace = "")
        String user);

    /**
     * 
     * @param response
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "alterLoginAnswer", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.AlterLoginAnswer")
    @ResponseWrapper(localName = "alterLoginAnswerResponse", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.AlterLoginAnswerResponse")
    @Action(input = "http://servicioInicioSesion/InicioSesion/alterLoginAnswerRequest", output = "http://servicioInicioSesion/InicioSesion/alterLoginAnswerResponse")
    public boolean alterLoginAnswer(
        @WebParam(name = "response", targetNamespace = "")
        String response);

    /**
     * 
     * @param usuaio
     * @param contrasena1
     * @param cedula
     * @param apellido
     * @param contrasena
     * @param respuesta
     * @param nombre
     * @param pregunta
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Registro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Registro", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.Registro")
    @ResponseWrapper(localName = "RegistroResponse", targetNamespace = "http://servicioInicioSesion/", className = "servicioiniciosesion.RegistroResponse")
    @Action(input = "http://servicioInicioSesion/InicioSesion/RegistroRequest", output = "http://servicioInicioSesion/InicioSesion/RegistroResponse")
    public String registro(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula,
        @WebParam(name = "usuaio", targetNamespace = "")
        String usuaio,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "contrasena1", targetNamespace = "")
        String contrasena1,
        @WebParam(name = "pregunta", targetNamespace = "")
        String pregunta,
        @WebParam(name = "respuesta", targetNamespace = "")
        String respuesta);

}
