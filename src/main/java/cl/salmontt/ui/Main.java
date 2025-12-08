package cl.salmontt.ui;

import cl.salmontt.data.GestorDatos;
import cl.salmontt.data.GestorUnidades;
import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Producto;
import cl.salmontt.model.UnidadOperativa;
import cl.salmontt.service.Buscador;
import cl.salmontt.service.Validador;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n===== UNIDADES OPERATIVAS DE PRUEBA =====");
        System.out.println();

        GestorUnidades gestorU = new GestorUnidades();
        ArrayList<UnidadOperativa> unidades = gestorU.obtenerUnidadesPrueba();

        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion(); //Polimorfismo
        }

        Scanner input = new Scanner(System.in);

        //crear el gestor de datos {@Link GestorDatos}
        GestorDatos gestor = new GestorDatos();

        //cargar el archivo "centros.txt"
        ArrayList<CentroCultivo> centros = gestor.cargarCentros("centros.txt");

        mostrarMenu(centros, input, gestor); //llamamos al manú
    }

    //Metodo para el menú
    public static void mostrarMenu(ArrayList<CentroCultivo> centros, Scanner input, GestorDatos gestor) {
        boolean salir = false;
        while (!salir) { //mientras la opción no sea salir, mostramos el menu
            System.out.println("\n>>>>>Menu<<<<<");
            System.out.println("1. Buscar todos los centros 'Salmontt'");
            System.out.println("2. Buscar centros por ID");
            System.out.println("3. Buscar centros por tipo de salmón");
            System.out.println("4. Buscar centros por producción (>= 1000 toneladas) ");
            System.out.println("5. Buscar productos por tipo");
            System.out.println("6. Cargar y guardar inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            System.out.println();

            String opcion = input.nextLine();

            switch (opcion) {
                case "1":
                    buscarTodosLosCentros(centros);
                    break;
                case "2":
                    buscarPorId(centros, input);
                    break;
                case "3":
                    buscarPorTipoSalmon(centros, input);
                    break;
                case "4":
                    buscarPorCienToneladas(centros);
                    break;
                case "5":
                    ArrayList<Producto> inventario = gestor.cargarInventario();
                    buscarProductosPorTipo(inventario, input);
                    break;
                case "6":
                    cargarInventarioYGuardar(gestor);
                    break;
                case "0":
                    salir = true;
                    System.out.println("Gracias por visitarnos. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    //Metodo para mostrar todos los centros (no hay filtro)
    public static void buscarTodosLosCentros(ArrayList<CentroCultivo> centros) {
        System.out.println("Se encontraron " + centros.size() + " centros Salmontt");
        System.out.println();

        if (centros.isEmpty()) {
            System.out.println("No existen centros disponibles.");
        } else {
            System.out.println(">>>>>>>>>> LISTADO DE CENTROS 'SALMONTT' <<<<<<<<<<");
            for (CentroCultivo centro : centros) {
                centro.mostrarInformacion(); //polimorfismo
            }
        }
    }

    //Metodo para mostrar todos los centros por ID
    public static void buscarPorId(ArrayList<CentroCultivo> centros, Scanner input) {
        System.out.println("Ingrese el ID del centro: ");
        String idCentro = input.nextLine();

        if (Validador.validarStringNoVacio(idCentro)) {
            ArrayList <CentroCultivo> centrosConId = Buscador.buscarPorId(centros, idCentro); //llamada al metodo de Buscador
            System.out.println("Se encontraron " + centrosConId.size() + " centros con el ID ingresado.");
            System.out.println();

            //Mostrar los centros, si los hay
                for (CentroCultivo centro : centrosConId) {
                    System.out.println(centro);
                }
            } else {
                System.out.println("El ID ingresado no es válido.");
            }
    }

    //Metodo para buscar centros por tipo de salmón
    public static void buscarPorTipoSalmon(ArrayList<CentroCultivo> centros, Scanner input) {
        System.out.println("Ingrese el tipo de salmon: ");
        String tipoSalmon = input.nextLine();

        if (Validador.validarStringNoVacio(tipoSalmon)) {
            ArrayList<CentroCultivo> centrosTipoSalmon = Buscador.buscarPorTipoSalmon(centros, tipoSalmon); //llamada al metodo de Buscador
            System.out.println("Se encontraron " + centrosTipoSalmon.size() + " centros con el tipo de salmon: " + tipoSalmon);
            System.out.println();

            //Mostrar la información, si la hay
            for (CentroCultivo centro : centrosTipoSalmon) {
                System.out.println(centro); //Mostrar información del o de los centros
            }
            } else {
                System.out.println("El tipo de salmón ingresado no es válido");
            }
    }

    //Metodo para buscar centros por producción en toneladas (>= 1000 toneladas)
    public static void buscarPorCienToneladas(ArrayList<CentroCultivo> centros) {
        ArrayList<CentroCultivo> centrosProduccionAlta = Buscador.buscarPorCienToneladas(centros);
        System.out.println("Se encontraron " + centrosProduccionAlta.size() + " centros con producción >= 1000 toneladas");
        System.out.println();
        System.out.println(">>>>>>>>>> CENTROS CON PRODUCCIÓN >= 1000 TONELADAS <<<<<<<<<<");

        //mostrar información, si la hay
            for (CentroCultivo centro : centrosProduccionAlta) {
                System.out.println(centro);
            }
    }

    //Metodo para buscar productos por tipo de salmon
    public static void buscarProductosPorTipo(ArrayList<Producto> inventario, Scanner input) {
        System.out.println("Ingrese el tipo de salmón a buscar: ");
        String nombreBuscado = input.nextLine();

        if (nombreBuscado == null || nombreBuscado.trim().isEmpty()) {
            System.out.println("El tipo de salmón ingresado no es válido.");
            return;
        }

        ArrayList<Producto> productosFiltrados = Buscador.filtrarPorNombre(inventario, nombreBuscado);

        if (productosFiltrados.isEmpty()) {
            System.out.println("No se encontró el tipo de salmón: " + nombreBuscado);
        } else {
            System.out.println("Se encontró " + productosFiltrados.size() + " centros con salmones del tipo " + nombreBuscado);
            for (Producto p : productosFiltrados) {
                System.out.println(p);
            }
        }
    }

    //METODO PARA CARGAR INVENTARIO DESDE EL GESTOR
    public static void cargarInventarioYGuardar(GestorDatos gestor) {
        ArrayList<Producto> inventario = gestor.cargarInventario();
        gestor.guardarInventario(inventario);
    }
}

