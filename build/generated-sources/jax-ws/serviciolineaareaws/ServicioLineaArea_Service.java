
package serviciolineaareaws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioLineaArea", targetNamespace = "http://servicioLineaAreaWS/", wsdlLocation = "http://localhost:8080/ProyectoSOAP-master/ServicioLineaArea?WSDL")
public class ServicioLineaArea_Service
    extends Service
{

    private final static URL SERVICIOLINEAAREA_WSDL_LOCATION;
    private final static WebServiceException SERVICIOLINEAAREA_EXCEPTION;
    private final static QName SERVICIOLINEAAREA_QNAME = new QName("http://servicioLineaAreaWS/", "ServicioLineaArea");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoSOAP-master/ServicioLineaArea?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOLINEAAREA_WSDL_LOCATION = url;
        SERVICIOLINEAAREA_EXCEPTION = e;
    }

    public ServicioLineaArea_Service() {
        super(__getWsdlLocation(), SERVICIOLINEAAREA_QNAME);
    }

    public ServicioLineaArea_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOLINEAAREA_QNAME, features);
    }

    public ServicioLineaArea_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOLINEAAREA_QNAME);
    }

    public ServicioLineaArea_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOLINEAAREA_QNAME, features);
    }

    public ServicioLineaArea_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioLineaArea_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioLineaArea
     */
    @WebEndpoint(name = "ServicioLineaAreaPort")
    public ServicioLineaArea getServicioLineaAreaPort() {
        return super.getPort(new QName("http://servicioLineaAreaWS/", "ServicioLineaAreaPort"), ServicioLineaArea.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioLineaArea
     */
    @WebEndpoint(name = "ServicioLineaAreaPort")
    public ServicioLineaArea getServicioLineaAreaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicioLineaAreaWS/", "ServicioLineaAreaPort"), ServicioLineaArea.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOLINEAAREA_EXCEPTION!= null) {
            throw SERVICIOLINEAAREA_EXCEPTION;
        }
        return SERVICIOLINEAAREA_WSDL_LOCATION;
    }

}
