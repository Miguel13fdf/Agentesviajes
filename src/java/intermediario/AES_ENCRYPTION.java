package intermediario;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class AES_ENCRYPTION {

    private String LLAVE = "ISTAAESEncrypt";

    // Clave de encriptación / desencriptación
    public SecretKeySpec crearClave(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }
    }

    public AES_ENCRYPTION() {
    }

    // Encriptar
    public String encrypt(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.getEncoder().encodeToString(encriptada);  // Cambio aquí
            return cadena_encriptada;
        } catch (Exception e) {
            return "";
        }
    }

    // Des-encriptación
    public String decrypt(String desencriptar) {
        try {
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.getDecoder().decode(desencriptar);  // Cambio aquí
            byte[] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        String encriptada = "";
        String aEnccriptar = "";

        AES_ENCRYPTION main = new AES_ENCRYPTION();

        aEnccriptar = JOptionPane.showInputDialog("Ingresa la cadena a encriptar: ");

        encriptada = main.encrypt(aEnccriptar);

        JOptionPane.showMessageDialog(null, encriptada);
        JOptionPane.showMessageDialog(null, main.decrypt(encriptada));
    }
}