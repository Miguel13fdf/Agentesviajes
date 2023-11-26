/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;


import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import serviciohotelws.ServicioHotel;
import serviciohotelws.ServicioHotel_Service;
import servicioiniciosesion.Cliente;
import servicioiniciosesion.InicioSesion;
import servicioiniciosesion.InicioSesion_Service;
import serviciolineaareaws.HorarioVuelo;
import serviciolineaareaws.LineaArea;
import serviciolineaareaws.ServicioLineaArea;
import serviciolineaareaws.ServicioLineaArea_Service;
import serviciotarjetaws.ServicioTarjetaCredito;
import serviciotarjetaws.ServicioTarjetaCredito_Service;
import serviciotarjetaws.Transaccion;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "Peticiones")
public class Peticiones {

    ServicioHotel_Service servicio = new ServicioHotel_Service();
    ServicioHotel cliente = servicio.getServicioHotelPort();
    private static final Logger LOGGER = Logger.getLogger(Peticiones.class.getName());//permite registrar mensajes en diferentes niveles
    private static FileHandler fileHandler;// maneja la redirección de los registros a un archivo.Se declaran estaticos para que  sea únicas para toda la clase

    @WebMethod(operationName = "realizarReserva")
    public String realizarReserva(@WebParam(name = "nombreCliente") String nombreCliente,
            @WebParam(name = "fechaInicio") String fechaInicio,
            @WebParam(name = "fechaFin") String fechaFin,
            @WebParam(name = "numeroHabitaciones") Integer numeroHabitaciones) {

        try {

            String resultado = cliente.reservarHotel(nombreCliente, fechaInicio, fechaFin, numeroHabitaciones);

            registrarActividad("Se realizó una reserva para " + nombreCliente + " desde " + fechaInicio + " hasta " + fechaFin + ".");

            //solo si la reserva es exitosa subcadena si empiza con Reserva realizada
            if (resultado.startsWith("Reserva realizada")) {
                enviarNotificacionCliente(nombreCliente, "¡Reserva exitosa! Detalles: " + resultado);
                aplicarDescuentoCliente(nombreCliente, numeroHabitaciones);
            }

            return resultado;
        } catch (Exception e) {
            return "Error al realizar la reserva: " + e.getMessage();
        }
    }

    static {
        try {
            // Configuración del manejador de archivos para el registro de actividad
            //// Crear una instancia de FileHandler que redirigirá los mensajes de registro a un archivo
            fileHandler = new FileHandler("actividad.log");
            // Agregar el FileHandler al Logger
            LOGGER.addHandler(fileHandler);
            // Configurar el formato del mensaje en el archivo de registro
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException | SecurityException e) {
            e.getMessage();
        }
    }

    private void registrarActividad(String mensaje) {

        LOGGER.info(mensaje);
    }

    // Función para enviar notificación al cliente 
    private void enviarNotificacionCliente(String nombreCliente, String mensaje) {
        LOGGER.log(Level.INFO, "Notificaci\u00f3n a {0}: {1}", new Object[]{nombreCliente, mensaje});
        // Se puede mensaje de texto, etc.
    }

    private void aplicarDescuentoCliente(String nombreCliente, Integer numeroHabitaciones) {
        LOGGER.log(Level.INFO, "Aplicando descuento a {0} por reserva de {1} habitaciones.", new Object[]{nombreCliente, numeroHabitaciones});

        // Definir los umbrales para aplicar descuentos
        int umbralDescuento5 = 3;
        int umbralDescuento10 = 5;
        int umbralDescuento35 = 20;

        // Obtener el porcentaje de descuento según el número de habitaciones
        double porcentajeDescuento = 0.0;
        if (numeroHabitaciones > umbralDescuento5 && numeroHabitaciones <= umbralDescuento10) {
            porcentajeDescuento = 0.05; // 5% de descuento
        } else if (numeroHabitaciones > umbralDescuento10 && numeroHabitaciones <= umbralDescuento35) {
            porcentajeDescuento = 0.10; // 10% de descuento
        } else if (numeroHabitaciones > umbralDescuento35) {
            porcentajeDescuento = 0.35; // 35% de descuento
        }

        // Simular la aplicación del descuento
        double precioTotalSinDescuento = calcularPrecioTotalSinDescuento(numeroHabitaciones);
        double descuento = precioTotalSinDescuento * porcentajeDescuento;
        double precioTotalConDescuento = precioTotalSinDescuento - descuento;

        // Imprimir información sobre el descuento aplicado
        LOGGER.log(Level.INFO, "Descuento aplicado a {0}: {1}%", new Object[]{nombreCliente, porcentajeDescuento * 100});
        LOGGER.log(Level.INFO, "Precio total sin descuento: {0}", precioTotalSinDescuento);
        LOGGER.log(Level.INFO, "Descuento aplicado: {0}", descuento);
        LOGGER.log(Level.INFO, "Precio total con descuento: {0}", precioTotalConDescuento);
    }

    private double calcularPrecioTotalSinDescuento(Integer numeroHabitaciones) {
        // Simular el cálculo del precio total sin descuento
        double precioPorHabitacion = 100.0; // Ajusta según tus necesidades
        return numeroHabitaciones * precioPorHabitacion;
    }

    @WebMethod(operationName = "verificarDisponibilidad")
    public String verificarDisponibilidad(@WebParam(name = "fechaInicio") String fechaInicio,
            @WebParam(name = "fechaFin") String fechaFin) {

        try {
            if (fechaInicio == null || fechaInicio.trim().isEmpty()
                    || fechaFin == null || fechaFin.trim().isEmpty()) {
                return "Las fechas de inicio y fin son obligatorias.";
            }
            String resultado = cliente.verificarDisponibilidad(fechaInicio, fechaFin);

            return resultado;

        } catch (Exception e) {
            return "Error al verificar disponibilidad: " + e.getMessage();
        }
    }
      @WebMethod
    public String cancelarReserva(@WebParam(name = "codigoreserva") String codigoreserva) {
        if (codigoreserva == null || codigoreserva.trim().isEmpty()) {
            return "El codigo de reserva es obligatorio.";
        }
      
          try {
              return cliente.cancelarReserva(codigoreserva);
        } catch (Exception e) {
            return "Error al cancelar la reserva: " + e.getMessage();
        }

    }
     //hacer excepciones 
    @WebMethod
    public String listarReservas() {

        return cliente.listarReservas();
    }
    
     ServicioLineaArea_Service serviciolineaarea = new ServicioLineaArea_Service();
     ServicioLineaArea cliente2 = serviciolineaarea.getServicioLineaAreaPort();
       @WebMethod(operationName = "RegistroHorario")
       //falta excepciones
    public boolean RegistroHorario(@WebParam(name = "id") String idhorario,
            @WebParam(name = "fecha") Date fecha,
            @WebParam(name = "horaSalida") String horaSalida,
            @WebParam(name = "horaLLegada") String horaLlegada) {
        return cliente2.registroHorario(idhorario, fecha, horaSalida, horaLlegada);//falta validacion de fecha de date a string 
    }
    //excepciones
    
     @WebMethod(operationName = "RegistroLineaArea")
    public boolean RegistroLineaArea(@WebParam(name = "id") int idLinea,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "horarios") List<HorarioVuelo> horarios) {
        return cliente2.registroLineaArea(idLinea, nombre, horarios);
    }
    //excepciones

    @WebMethod(operationName = "BuscarLineaArea")
    public LineaArea buscarLineaArea(@WebParam(name = "nombre") String nombre) {
        return cliente2.buscarLineaArea(nombre);
    }
//excepciones
    @WebMethod(operationName = "BuscarVuelos")
    public List<HorarioVuelo> buscarVuelosDisponibles(@WebParam(name = "fecha") Date fecha,
            @WebParam(name = "hora") String hora) {
        return cliente2.buscarVuelos(fecha, hora);//validacion de fecha
    }

    @WebMethod(operationName = "CambiarVuelo")
    public boolean cambiarVuelo(@WebParam(name = "numeroVuelo") int idVuelo,
            @WebParam(name = "nuevaFecha") String nuevaFecha,
            @WebParam(name = "nuevaHora") String nuevaHora) {
        return cliente2.cambiarVuelo(idVuelo, nuevaFecha, nuevaHora);
    }

    @WebMethod(operationName = "AnularVuelo")
    public Boolean anularVuelo(@WebParam(name = "numeroVuelo") String numeroVuelo) {
        return cliente2.anularVuelo(numeroVuelo);
    }
    
     InicioSesion_Service servicioiniciosesion = new InicioSesion_Service();
     InicioSesion cliente3 = servicioiniciosesion.getInicioSesionPort();
     //excepciones
     @WebMethod(operationName = "login")
    public Cliente login(@WebParam(name = "username") String usuario, @WebParam(name = "password") String contraseña) {
        return cliente3.login(usuario, usuario);
    }

    @WebMethod(operationName = "Regístrese")
    public boolean registrese(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "cedula") String cedula,
            @WebParam(name = "usuario") String usuario, @WebParam(name = "contraseña") String contra, @WebParam(name = "contraseña1") String contra1) {

        return cliente3.regístrese(nombre, apellido, cedula, usuario, contra, contra1);
    }
     ServicioTarjetaCredito_Service servicioitarjetacredito = new ServicioTarjetaCredito_Service();
     ServicioTarjetaCredito cliente4 = servicioitarjetacredito.getServicioTarjetaCreditoPort();
     //Manejo de excepciones
       @WebMethod(operationName = "RegistroTarjeta")
    public boolean Registro(@WebParam(name = "numero") String numero,
            @WebParam(name = "titular") String titular,
            @WebParam(name = "fechaVencimiento") String fechaVencimiento,
            @WebParam(name = "codigoSeguridad") String codigoSeguridad,
            @WebParam(name = "saldoDisponible") float saldoDisponible) {
      
        return cliente4.registroTarjeta(numero, titular, fechaVencimiento, codigoSeguridad, saldoDisponible); 
    }

    //METODO PARA ACTUALIZAR LA TARJETA DE CREDITO
    @WebMethod(operationName = "ActualizarTarjeta")
    public boolean ActualizarTarjeta(@WebParam(name = "numero") String numero,
            @WebParam(name = "titular") String titular,
            @WebParam(name = "fechaVencimiento") String fechaVencimiento,
            @WebParam(name = "codigoSeguridad") String codigoSeguridad,
            @WebParam(name = "saldoDisponible") float saldoDisponible) {
      
        return cliente4.actualizarTarjeta(numero, titular, fechaVencimiento, codigoSeguridad, saldoDisponible); 
    }

   

    //METODO PARA CONSULTAR SALDO DISPONIBLE
    @WebMethod(operationName = "consultarSaldoDisponible")
    public Float consultarSaldoDisponible(@WebParam(name = "numero") String numeroTarjeta) {
         return cliente4.consultarSaldoDisponible(numeroTarjeta);
    }

    //METODO PARA REALIZAR TRANSACCIONES
    @WebMethod
    public boolean realizarTransaccion(@WebParam(name = "numeroTarjeta") String numeroTarjeta,
            @WebParam(name = "monto") double monto,
            @WebParam(name = "descripcion") String descripcion,
            @WebParam(name = "fecha") Date fecha) {

         return cliente4.realizarTransaccion(numeroTarjeta, monto, descripcion, fecha);
    }

    //METODO PARA VER EL HISTORIAL DE LA TARJETA DE CREDITO
    @WebMethod
    public List<Transaccion> obtenerHistorialTarjeta(@WebParam(name = "numeroTarjeta") String numeroTarjeta) {
        return cliente4.obtenerHistorialTarjeta(numeroTarjeta);
    }
    

    //METODO PARA RETIRAR DINERO
    @WebMethod(operationName = "retirarDinero")
    public boolean retirarDinero(@WebParam(name = "numero") String numeroTarjeta,
            @WebParam(name = "monto") float monto,
            @WebParam(name = "idCliente") int idCliente) {
         return cliente4.retirarDinero(numeroTarjeta, monto, idCliente);
    }

    
    

}
