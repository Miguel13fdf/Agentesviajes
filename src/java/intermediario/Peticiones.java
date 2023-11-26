/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;
import serviciohotelws.ServicioHotel;
import servicioiniciosesion.Cliente;
import servicioiniciosesion.InicioSesion;
import serviciolineaareaws.HorarioVuelo;
import serviciolineaareaws.LineaArea;
import serviciolineaareaws.ServicioLineaArea;
import serviciotarjetaws.ServicioTarjetaCredito;
import serviciotarjetaws.Transaccion;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "Peticiones")
public class Peticiones {
ServicioHotel servicioHotel = new ServicioHotel() {
    @Override
    public String verificarDisponibilidad(String fechaInicio, String fechaFin) {
         return servicioHotel.verificarDisponibilidad(fechaInicio, fechaFin);
    }

    @Override
    public String cancelarReserva(String codigoreserva) {
       return servicioHotel.cancelarReserva(codigoreserva);
    }

    @Override
    public String listarReservas() {
      return servicioHotel.listarReservas();
    }

    @Override
    public String reservarHotel(String nombreCliente, String fechaInicio, String fechaFin, Integer numeroHabitaciones) {
      return  servicioHotel.reservarHotel(nombreCliente, fechaInicio, fechaFin, numeroHabitaciones);
    }
};
 @WebMethod
    public String verificarDisponibilidadHotel(
            @WebParam(name = "fechaInicio") String fechaInicio,
            @WebParam(name = "fechaFin") String fechaFin) {

        if (!isValidDateFormat(fechaInicio) || !isValidDateFormat(fechaFin)) {
            return "Formato de fecha inválido.";
        }


        return servicioHotel.verificarDisponibilidad(fechaInicio, fechaFin);
    }
 private boolean isValidDateFormat(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            
            return false;
        }
    }
InicioSesion inicioSesion = new InicioSesion() {
    @Override
    public Cliente login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean regístrese(String nombre, String apellido, String cedula, String usuario, String contraseña, String contraseña1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
ServicioLineaArea servicioLineaArea = new ServicioLineaArea() {
    @Override
    public List<HorarioVuelo> buscarVuelos(XMLGregorianCalendar fecha, String hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registroHorario(String id, XMLGregorianCalendar fecha, String horaSalida, String horaLLegada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LineaArea buscarLineaArea(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean anularVuelo(String numeroVuelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cambiarVuelo(int numeroVuelo, String nuevaFecha, String nuevaHora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registroLineaArea(int id, String nombre, List<HorarioVuelo> arg2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
ServicioTarjetaCredito servicioTarjetaCredito = new ServicioTarjetaCredito() {
    @Override
    public boolean realizarTransaccion(String numeroTarjeta, double monto, String descripcion, XMLGregorianCalendar fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float consultarSaldoDisponible(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarTarjeta(String numero, String titular, String fechaVencimiento, String codigoSeguridad, float saldoDisponible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarFechaVencimiento(String arg0, String arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaccion> obtenerHistorialTarjeta(String numeroTarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarTarjetaCredito(String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retirarDinero(String numero, float monto, int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registroTarjeta(String numero, String titular, String fechaVencimiento, String codigoSeguridad, float saldoDisponible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
