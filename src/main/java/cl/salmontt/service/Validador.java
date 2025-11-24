package cl.salmontt.service;

/**
 * Clase que se encarga de validar los inputs ingresados por consola.
 * Valida numeros enteros, decimales o textos que no estén vacíos.
 */

public class Validador {
    //Valida si el numero ingresado es entero válido
    public static boolean validarEntero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Valida si el numero ingresado es decimal válido
    public static boolean validarDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }  catch (NumberFormatException e) {
            return false;
        }
    }

    //Valida que el texto no esté vacío
    public static boolean validarStringNoVacio(String str) {
        return str != null && !str.trim().isEmpty();
    }
}
