package cl.salmontt.ui;

import cl.salmontt.data.GestorEntidades;
import cl.salmontt.model.*;

import  javax.swing.JOptionPane;

public class MenuGUI {

    public static void main (String[] args) {
        GestorEntidades gestorEntidades = new GestorEntidades();
           mostrarMenu(gestorEntidades);

        }

        public static void mostrarMenu(GestorEntidades gestor){
        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    ">>>>>Menu<<<<<\n"
                    + "1. Ingresar Proveedor\n"
                    + "2. Ingresar Empleado\n"
                    + "3. Mostrar registros\n"
                    + "0. Salir");

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    String nombreProv = JOptionPane.showInputDialog("Nombre del proveedor: ");
                    String rubro = JOptionPane.showInputDialog("Rubro: ");
                    gestor.agregarEntidad(new Proveedor(nombreProv, rubro));
                    break;

                case "2":
                    String nombreEmp = JOptionPane.showInputDialog("Nombre del empleado: ");
                    String cargo = JOptionPane.showInputDialog("Cargo: ");
                    gestor.agregarEntidad(new Empleado(nombreEmp, cargo));
                    break;

                case "3":
                    StringBuilder resumen = new StringBuilder();
                    for (Registrable reg : gestor.getEntidades()) {
                        resumen.append(reg.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resumen.toString());
                    break;

                case "0":
                    salir = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo");
            }
        }
    }
}
