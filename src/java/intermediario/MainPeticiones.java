package intermediario;

/**
 *
 * @author USUARIO
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPeticiones {

    public static void main(String[] args) {
        // Configuración para mostrar mensajes de nivel INFO en la consola
        Logger.getLogger("").setLevel(Level.INFO);

        Peticiones peticiones = new Peticiones();

//        // Realizar una reserva exitosa
//        String resultadoReservaExitosa = peticiones.realizarReserva("Juan Pérez", "2023-12-01", "2023-12-05", 1);
//        System.out.println("Resultado Reserva Exitosa: " + resultadoReservaExitosa);
//        // Aqui para probar que pasa en una reserva con datos incorrectos
        String resultadoReservaInvalida = peticiones.realizarReserva(null, "", "2023-12-05", 0);
        System.out.println("Resultado Reserva Inválida: " + resultadoReservaInvalida);

        // Muestra el contenido del archivo de registro "actividad.log"
        // Se debe ajustar la ruta del archivo según donde se haya creado
        // en tu proyecto o proporcionar la ruta completa.
        LeerArchivoDeRegistro();

    }

    private static void LeerArchivoDeRegistro() {
        // Debes ajustar la ruta del archivo según donde se haya creado
        // en tu proyecto o proporcionar la ruta completa.
        String rutaArchivo = "actividad.log";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido del archivo de registro:");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.err.println("Error al leer el archivo de registro: " + e.getMessage());
        }
    }
}
