/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import serviciohotelws.ServicioHotel;
import serviciohotelws.ServicioHotel_Service;

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
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             LocalDate fechaInicioDate = LocalDate.parse(fechaInicio, formatter);
             LocalDate fechaFinDate = LocalDate.parse(fechaFin, formatter);

        if (fechaInicioDate.isAfter(fechaFinDate)) {
            return "La fecha de inicio debe ser antes de la fecha de fin.";
        }
         String resultado = cliente.verificarDisponibilidad( fechaInicio, fechaFin);

            return resultado;
          
        } catch (Exception e) {
            return "Error al verificar disponibilidad: " + e.getMessage();
        }
    }
}
