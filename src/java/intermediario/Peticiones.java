package intermediario;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import serviciohotelws.ServicioHotel;
import serviciohotelws.ServicioHotel_Service;

import servicioiniciosesion.InicioSesion;
import servicioiniciosesion.InicioSesion_Service;
import serviciolineaareaws.HorarioVuelo;

import serviciolineaareaws.ServicioLineaArea;
import serviciolineaareaws.ServicioLineaArea_Service;
import serviciotarjetaws.ServicioTarjetaCredito;
import serviciotarjetaws.ServicioTarjetaCredito_Service;
import serviciotarjetaws.Transaccion;
import validator.IValidator;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "Peticiones")
public class Peticiones implements IValidator {
    
    ServicioHotel_Service servicio = new ServicioHotel_Service();
    ServicioHotel cliente = servicio.getServicioHotelPort();
    private static final Logger LOGGER = Logger.getLogger(Peticiones.class.getName());//permite registrar mensajes en diferentes niveles
    private static FileHandler fileHandler;// maneja la redirección de los registros a un archivo.Se declaran estaticos para que  sea únicas para toda la clase

    @WebMethod(operationName = "realizarReserva")
    public String realizarReserva(@WebParam(name = "nombreCliente") String nombreCliente,
            @WebParam(name = "fechaInicio") String fechaInicio,
            @WebParam(name = "fechaFin") String fechaFin,
            @WebParam(name = "numeroHabitaciones") Integer numeroHabitaciones) {

        // VALIDACIONES
        if (!validateName(nombreCliente)) {
            JOptionPane.showMessageDialog(null, "Nombre de cliente no válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        if (!validateDate(fechaInicio) || !validateDate(fechaFin)) {
            JOptionPane.showMessageDialog(null, "Fechas de inicio o fin no válidas.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        if (!validateNumberOfRooms(numeroHabitaciones)) {
            JOptionPane.showMessageDialog(null, "Número de habitaciones no válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

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
        if (mensaje == null || mensaje.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Intento fallido al registrar una actividad (El mensaje esta vacio).", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Registra el mensaje si pasa la validación
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

                JOptionPane.showMessageDialog(null, "Las fechas de inicio y fin son obligatorias.", "Error", JOptionPane.WARNING_MESSAGE);
                return "";
            }
            if (!validateDate(fechaInicio) || !validateDate(fechaFin)) {
                JOptionPane.showMessageDialog(null, "Fechas no válidas para verificar disponibilidad.", "Error", JOptionPane.WARNING_MESSAGE);
                return "";
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
            JOptionPane.showMessageDialog(null, "El codigo de reserva es obligatorio.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        try {
            return cliente.cancelarReserva(codigoreserva);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            return "";
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
    public String RegistroHorario(
            @WebParam(name = "id") String idhorario,
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "horaSalida") String horaSalida,
            @WebParam(name = "horaLLegada") String horaLlegada) {
        return cliente2.registroHorario(fecha, idhorario, horaSalida, horaLlegada);
    }

    @WebMethod(operationName = "ListarHorarios")
    public String ListarHorarios() {
        return cliente2.listarHorarios();
    }

    @WebMethod(operationName = "RegistroLineaAerea")
    public String registroLineaAerea(
            @WebParam(name = "id") int idLinea,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "idHorarios") String idHorarios) {
        return cliente2.registroLineaAerea(idLinea, nombre, idHorarios);
    }

    @WebMethod(operationName = "ListarLieneasAereas")
    public String ListarLieneasAereas() {
        return cliente2.listarLieneasAereas();
    }

    @WebMethod(operationName = "BuscarLineaArea")
    public String buscarLineaArea(@WebParam(name = "nombre") String nombre) {
        return cliente2.buscarLineaArea(nombre);
    }

    @WebMethod(operationName = "BuscarVuelos")
    public List<HorarioVuelo> buscarVuelosDisponibles(
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "hora") String hora) {

        return cliente2.buscarVuelos(fecha, hora);
    }

    public String cambiarVuelo(
            @WebParam(name = "numeroVuelo") String idVuelo,
            @WebParam(name = "nuevaFecha") String nuevaFecha,
            @WebParam(name = "nuevaHoraSalida") String nuevaHoraSalida,
            @WebParam(name = "nuevaHoraLlegada") String nuevaHoraLlegada) {

        return cliente2.cambiarVuelo(idVuelo, nuevaFecha, nuevaHoraSalida, nuevaHoraLlegada);
    }

    @WebMethod(operationName = "AnularVuelo")
    public String anularVuelo(@WebParam(name = "numeroVuelo") String numeroVuelo) {

        return cliente2.anularVuelo(numeroVuelo);
    }

    InicioSesion_Service servicioiniciosesion = new InicioSesion_Service();
    InicioSesion cliente3 = servicioiniciosesion.getInicioSesionPort();

    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
            AES_ENCRYPTION encriptacion = new AES_ENCRYPTION();

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario y contraseña son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }
        String desencriptado = encriptacion.encrypt(password);
        System.out.println(password);
        System.out.println(desencriptado + "HOLAAAAAAAAAAAAAAAA");
        return cliente3.login(username, desencriptado);
    }

    @WebMethod(operationName = "Registro")
    public String Registro(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "cedula") String cedula, @WebParam(name = "usuaio") String usuaio, @WebParam(name = "contrasena") String contrasena, @WebParam(name = "contrasena1") String contrasena1, @WebParam(name = "pregunta") String pregunta, @WebParam(name = "respuesta") String respuesta) {
            AES_ENCRYPTION encriptacion = new AES_ENCRYPTION();

        if (!validateName(nombre)) {
            return "Nombre no válido.";
        }

        if (!validateName(apellido)) {
            return "Apellido no válido.";
        }

        if (!validateIdentificationCard(cedula)) {
            return "Cédula no válida.";
        }
        String encriptado = encriptacion.encrypt(contrasena);

        return cliente3.registro(nombre, apellido, cedula, usuaio, encriptado, encriptado, pregunta, respuesta);
    }

    ServicioTarjetaCredito_Service servicioitarjetacredito = new ServicioTarjetaCredito_Service();
    ServicioTarjetaCredito cliente4 = servicioitarjetacredito.getServicioTarjetaCreditoPort();

    @WebMethod(operationName = "RegistroTarjeta")
    public String RegistroTarjeta(@WebParam(name = "numero") String numero,// el numero de la tarjeta tiene una longitud de 10
            @WebParam(name = "titular") String titular,
            @WebParam(name = "fechaVencimiento") String fechaVencimiento,
            @WebParam(name = "codigoSeguridad") String codigoSeguridad,
            @WebParam(name = "saldoDisponible") float saldoDisponible,
            @WebParam(name = "cliente") String cliente) {

        // VALIDACIONES
        if (!validateCardNumber(numero)) {
            JOptionPane.showMessageDialog(null, "Número de tarjeta no válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        if (!validateName(titular)) {
            JOptionPane.showMessageDialog(null, "Titular no válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        if (!validateDate(fechaVencimiento)) {
            JOptionPane.showMessageDialog(null, "Fecha de vencimiento no válida.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        if (!validateCost((double) saldoDisponible)) {
            JOptionPane.showMessageDialog(null, "Saldo no válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return "";
        }

        return cliente4.registroTarjeta(numero, titular, fechaVencimiento, codigoSeguridad, saldoDisponible, cliente);
    }

    @WebMethod(operationName = "ActualizarTarjeta")
    public boolean ActualizarTarjeta(@WebParam(name = "numero") String numero,
            @WebParam(name = "titular") String titular,
            @WebParam(name = "fechaVencimiento") String fechaVencimiento,
            @WebParam(name = "codigoSeguridad") String codigoSeguridad,
            @WebParam(name = "saldoDisponible") float saldoDisponible) {

        return cliente4.actualizarTarjeta(numero, titular, fechaVencimiento, codigoSeguridad, saldoDisponible);
    }

    @WebMethod(operationName = "validarFechaVencimiento")
    public boolean validarFechaVencimiento(String numeroTarjeta, String fechaVencimiento) {
        return cliente4.validarFechaVencimiento(numeroTarjeta, fechaVencimiento);
    }

    @WebMethod(operationName = "consultarSaldoDisponible")
    public Float consultarSaldoDisponible(@WebParam(name = "numero") String numeroTarjeta) {
        return cliente4.consultarSaldoDisponible(numeroTarjeta);
    }

    @WebMethod(operationName = "realizartTransaccion")
    public boolean realizarTransaccion(
            @WebParam(name = "numeroTarjeta") String numeroTarjeta,
            @WebParam(name = "monto") double monto,
            @WebParam(name = "descripcion") String descripcion,
            @WebParam(name = "fecha") Date fecha) {
        try {
            GregorianCalendar grego = new GregorianCalendar();
            grego.setTime(fecha);
            XMLGregorianCalendar xmlgrego = DatatypeFactory.newInstance().newXMLGregorianCalendar(grego);
            return cliente4.realizarTransaccion(numeroTarjeta, monto, descripcion, xmlgrego);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return false;
        }

    }

    @WebMethod(operationName = "obtenerHistorialTarjeta")
    public List<Transaccion> obtenerHistorialTarjeta(@WebParam(name = "numeroTarjeta") String numeroTarjeta) {
        // Buscar la tarjeta de crédito en la lista de tarjetas

        return cliente4.obtenerHistorialTarjeta(numeroTarjeta);
    }

    //METODO PARA RETIRAR DINERO
    @WebMethod(operationName = "retirarDinero")
    public boolean retirarDinero(@WebParam(name = "numeroTarjeta") String numeroTarjeta,
            @WebParam(name = "idcliente") int idcliente,
            @WebParam(name = "monto") float monto) {

        return cliente4.retirarDinero(numeroTarjeta, monto, idcliente);
    }
}
