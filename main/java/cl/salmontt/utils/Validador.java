package cl.salmontt.utils;

import javax.swing.JOptionPane;
import cl.salmontt.model.Direccion;

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

    //METODO PARA EL MENUGUI
    public static int pedirInt(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) return -1; // usuario canceló
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
            }
        }
    }

    public static double pedirDouble(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) return -1; // usuario canceló
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número decimal válido.");
            }
        }
    }

    public static String pedirString(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(mensaje);
            if (input == null) return null; // usuario canceló
            if (validarStringNoVacio(input)) return input;
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.");
        }
    }

    public static Direccion pedirDireccion() {
        String calle = pedirString("Calle: ");
        int numero = pedirInt("Número: ");
        String tipoDireccion = pedirString("Tipo de domicilio (Casa/Depto/Oficina): ");
        String numeroInterno = pedirString("Número interno: ");
        String comuna = pedirString("Comuna: ");
        String region = pedirString("Región: ");

        if (calle != null && numero != -1 && tipoDireccion != null && numeroInterno != null
                && comuna != null && region != null) {
            return new Direccion(calle, numero, tipoDireccion, numeroInterno, comuna, region);
        }
        return null;
    }
}
