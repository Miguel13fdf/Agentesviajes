/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package validators;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public interface IValidator {

    public default boolean validateDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(date);
        return formattedDate != null && !formattedDate.isEmpty();
    }

    public default boolean validateDateRangeCreditCard(Date date) {
        if (validateDate(date)) {
            Date currentDate = new Date();
            // Validamos con la fecha actual tomando la fecha de expiración
            if (currentDate.before(date)) {
                //Sabiendo que 
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.YEAR, 5);
                Date expireIn5Years = calendar.getTime();

                return currentDate.before(expireIn5Years);
            }
        }
        return false;
    }

    public default boolean validateCost(Double costo) {
        return costo > 0 && !costo.isNaN();
    }

    public default boolean validateName(String name) {
        return name.matches("^[a-zA-ZáéíóúñÑ ]+$") && name.length() >= 2;
    }

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
            name.replaceFirst(charChange, charChange.toUpperCase());
        }
        return name.trim();
    }

    //public boolean validateHour(String hour);
    public default boolean validateCardNumber(String cardNumber) {
        cardNumber = cardNumber.replaceAll("\\s+", "");

        String regex = "^[0-9]{16}$";

        return cardNumber.matches(regex) && cardNumber.length() == 16;
    }

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
}
