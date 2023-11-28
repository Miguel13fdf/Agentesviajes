package validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public interface IValidator {

    //  Comprueba si se encuentra dentro de rangos de fechas válidos.
    public default boolean validateDate(String dateString) {
        if (dateString == null || dateString.isEmpty()) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);  // No permitir conversiones automáticas

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(dateString));

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            return year >= 1 && year <= 9999 && month >= 0 && month <= 11 && day >= 1 && day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        } catch (ParseException e) {
            return false;
        }
    }

    // Valida un string de fecha para la fecha de vencimiento de una tarjeta de crédito.
    public default boolean validateDateRangeCreditCard(String date) {
        if (validateDate(date)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);

            try {
                Date currentDate = new Date();
                Date expirationDate = sdf.parse(date);

                if (currentDate.before(expirationDate)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(expirationDate);
                    calendar.add(Calendar.YEAR, 5);
                    Date expireIn5Years = calendar.getTime();

                    return currentDate.before(expireIn5Years);
                }
            } catch (ParseException e) {
                return false; // Error al parsear la fecha
            }
        }
        return false; // Fecha no válida
    }

    // Valida un valor para asegurar que sea mayor que 0 y no NaN.
    public default boolean validateCost(Double costo) {
        return costo > 0 && !costo.isNaN();
    }

    // Permitir solo caracteres alfabéticos y espacios, con una longitud mínima de 2.
    public default boolean validateName(String name) {
        return name.matches("^[a-zA-ZáéíóúñÑ ]+$") && name.length() >= 2;
    }

    // Poner en mayúscula la primera letra de cada palabra.
    public default String correctName(String name) {
        if (name.contains(" ")) {
            String[] mayus = name.toLowerCase().split(" ");
            if (mayus.length > 0) {
                name = "";
                for (int i = 0; i < mayus.length; i++) {
                    String charChange = String.valueOf(mayus[i].charAt(0));
                    mayus[i] = mayus[i].replaceFirst(charChange, charChange.toUpperCase());
                    name = name + mayus[i] + " ";
                }
            } else {
                return "Invalidate String";
            }
        } else {
            String charChange = String.valueOf(name.charAt(0));

            name = name.replaceFirst(charChange, charChange.toUpperCase());
        }
        return name.trim();
    }

    // Validar un número de tarjeta de crédito asegurándose de que consta de 16 caracteres numéricos.
    //public boolean validateHour(String hour);
    public default boolean validateCardNumber(String cardNumber) {
        cardNumber = cardNumber.replaceAll("\\s+", "");

        String regex = "^[0-9]{16}$";

        return cardNumber.matches(regex) && cardNumber.length() == 16;
    }

    // Validar el saldo de una cuenta para asegurarse de que es un valor positivo finito.
    public default boolean validateAccountBalance(Double balance) {
        return !balance.isInfinite() && balance > 0;
    }

    //Validar la cédula - Solo Ecuador -- ¿Se implementa?
    public default boolean validateIdentificationCard(String IdentificationCard) {
        int suma = 0;
        try {
            //Se verifica que la cédula tenga 10 dígitos
            if (IdentificationCard.length() != 10) {
                return false;
            } else {
                //Creamos Arrays de enteros que obtienen su valor de dividir el tamaño de la cédula para 2
                int a[] = new int[IdentificationCard.length() / 2];
                int b[] = new int[(IdentificationCard.length() / 2)];
                int c = 0;
                int d = 1;
                //Se itera bajo una lógica similar / 2
                for (int i = 0; i < IdentificationCard.length() / 2; i++) {
                    a[i] = Integer.parseInt(String.valueOf(IdentificationCard.charAt(c)));
                    c = c + 2;
                    if (i < (IdentificationCard.length() / 2) - 1) {
                        b[i] = Integer.parseInt(String.valueOf(IdentificationCard.charAt(d)));
                        d = d + 2;
                    }
                }
                //Tomamos el 1er Array y multiplicamos sus valores * 2
                for (int i = 0; i < a.length; i++) {
                    a[i] = a[i] * 2;
                    //A razón de esto, verificamos que sea mayor a 9 y se le quita el mismo valor
                    if (a[i] > 9) {
                        a[i] = a[i] - 9;
                    }
                    //Asignamos el valor a la variable suma (a + b mientras se itera)
                    suma = suma + a[i] + b[i];
                }
                //Dividimos la suma para 10 y la asignamos a una variable auxiliar
                int aux = suma / 10;
                //Verificamos el dígito controlador de la cédula
                int dec = (aux + 1) * 10;
                if ((dec - suma) == Integer.parseInt(String.valueOf(IdentificationCard.charAt(IdentificationCard.length() - 1)))) {
                    return true;
                } else {
                    //Criterio adicional en caso de que el dígito controlador sea 0
                    return suma % 10 == 0 && IdentificationCard.charAt(IdentificationCard.length() - 1) == '0';
                }
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public default boolean validateNumberOfRooms(int numberOfRooms) {
        return numberOfRooms > 0;
    }

    public default boolean ValidatePassword(String pw1, String pw2) {
        return (pw1 == null ? pw2 == null : pw1.equals(pw2));
    }
}
