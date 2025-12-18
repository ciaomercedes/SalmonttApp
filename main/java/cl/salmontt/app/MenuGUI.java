package cl.salmontt.app;

import cl.salmontt.data.GestorEntidades;
import cl.salmontt.model.*;
import cl.salmontt.utils.Validador;

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
                    """
                            >>>>>Menu<<<<<
                            1. Ingresar Unidad Operativa
                            2. Ingresar Empleado
                            3. Mostrar registros
                            0. Salir""");

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    String idCentro = Validador.pedirString("ID del Centro de Cultivo: ");
                    String nombreCentro = Validador.pedirString("Nombre del Centro de Cultivo: ");
                    String comuna = Validador.pedirString("Comuna: ");
                    int produccion = Validador.pedirInt("Toneladas de producción (t): ");
                    double profundidadAgua = Validador.pedirDouble("Produndidad Agua (mts): ");
                    double salinidad = Validador.pedirDouble("Salinidad (PSU): ");
                    String tipoSalmon = Validador.pedirString("Tipo de Salmón: ");

                    if (idCentro != null && nombreCentro != null && comuna != null && tipoSalmon != null) {
                        gestor.agregarEntidad(new CentroCultivo(idCentro, nombreCentro, comuna, produccion,
                                profundidadAgua, salinidad, tipoSalmon));
                    }
                    break;

                case "2":
                    String nombreEmp = Validador.pedirString("Nombre: ");
                    String apellidoEmp = Validador.pedirString("Apellido: ");
                    String rutEmp = Validador.pedirString("Rut: ");
                    String cargo = Validador.pedirString("Cargo: ");

                    //Datos direccion
                    Direccion dir = Validador.pedirDireccion();

                    // Solo crear el empleado si todos los datos son válidos
                    if (nombreEmp != null && apellidoEmp != null && rutEmp != null
                            && cargo != null && dir != null) {
                        Empleado emp = new Empleado(nombreEmp, apellidoEmp, rutEmp, dir, cargo);
                        gestor.agregarEntidad(emp); // Se agrega el Empleado
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro cancelado por datos incompletos.");
                    }
                    break;

                case "3":
                    StringBuilder resumen = new StringBuilder();
                    for (Registrable reg : gestor.getEntidades()) {
                        resumen.append(reg.toString()).append("\n");
                        if (reg instanceof Empleado) resumen.append(" → Tipo: Empleado\n");
                        else if (reg instanceof CentroCultivo) resumen.append(" → Tipo: Centro de Cultivo\n");
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
