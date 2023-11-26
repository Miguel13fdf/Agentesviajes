
package serviciohotelws;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioHotel", targetNamespace = "http://servicioHotelWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioHotel {


    /**
     * 
     * @param fechaInicio
     * @param fechaFin
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificarDisponibilidad", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.VerificarDisponibilidad")
    @ResponseWrapper(localName = "verificarDisponibilidadResponse", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.VerificarDisponibilidadResponse")
    @Action(input = "http://servicioHotelWS/ServicioHotel/verificarDisponibilidadRequest", output = "http://servicioHotelWS/ServicioHotel/verificarDisponibilidadResponse")
    public String verificarDisponibilidad(
        @WebParam(name = "fechaInicio", targetNamespace = "")
        String fechaInicio,
        @WebParam(name = "fechaFin", targetNamespace = "")
        String fechaFin);

    /**
     * 
     * @param codigoreserva
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelarReserva", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.CancelarReserva")
    @ResponseWrapper(localName = "cancelarReservaResponse", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.CancelarReservaResponse")
    @Action(input = "http://servicioHotelWS/ServicioHotel/cancelarReservaRequest", output = "http://servicioHotelWS/ServicioHotel/cancelarReservaResponse")
    public String cancelarReserva(
        @WebParam(name = "codigoreserva", targetNamespace = "")
        String codigoreserva);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarReservas", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.ListarReservas")
    @ResponseWrapper(localName = "listarReservasResponse", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.ListarReservasResponse")
    @Action(input = "http://servicioHotelWS/ServicioHotel/listarReservasRequest", output = "http://servicioHotelWS/ServicioHotel/listarReservasResponse")
    public String listarReservas();

    /**
     * 
     * @param numeroHabitaciones
     * @param nombreCliente
     * @param fechaInicio
     * @param fechaFin
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reservarHotel", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.ReservarHotel")
    @ResponseWrapper(localName = "reservarHotelResponse", targetNamespace = "http://servicioHotelWS/", className = "serviciohotelws.ReservarHotelResponse")
    @Action(input = "http://servicioHotelWS/ServicioHotel/reservarHotelRequest", output = "http://servicioHotelWS/ServicioHotel/reservarHotelResponse")
    public String reservarHotel(
        @WebParam(name = "nombreCliente", targetNamespace = "")
        String nombreCliente,
        @WebParam(name = "fechaInicio", targetNamespace = "")
        String fechaInicio,
        @WebParam(name = "fechaFin", targetNamespace = "")
        String fechaFin,
        @WebParam(name = "numeroHabitaciones", targetNamespace = "")
        Integer numeroHabitaciones);

}
