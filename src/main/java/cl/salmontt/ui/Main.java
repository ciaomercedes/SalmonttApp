package cl.salmontt.ui;

import cl.salmontt.data.GestorDatos;
import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Producto;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //crear el gestor de datos {@link GestorDatos}
        GestorDatos gestor = new GestorDatos();

        //cargar el archivo "centros.txt"
        ArrayList<CentroCultivo> centros = gestor.cargarCentros("centros.txt");


        //Mostrar todos los centros (no hay filtro)
        System.out.println(">>>>>>>>>> LISTADO CENTROS DE CULTIVO 'SALMONTT' <<<<<<<<<<");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        //FILTRO 1: condición de Centros con producción igual o mayor a 1000 toneladas
        System.out.println(">>>>>>>>>> CENTROS CON PRODUCCIÓN >= 1000 TONELADAS <<<<<<<<<<");
        for (CentroCultivo c : centros) {
            if (c.getToneladas() >= 1000) {
                System.out.println(c);
            }
        }

        //FILTRO 2: condición de Centros con producción de Atlántico
        System.out.println(">>>>>>>>>> CENTROS CON PRODUCCIÓN DE SALMÓN ATLÁNTICO <<<<<<<<<<");
        for (CentroCultivo c : centros) {
            if (c.getTipoSalmon().equals("Atlantico")) {
                System.out.println(c);
            }
        }

        //CARGAR INVENTARIO DESDE EL GESTOR
        ArrayList<Producto> inventario = gestor.cargarInventario();

        //DESCARGAR EL INVENTARIO
        gestor.guardarInventario(inventario);

    }

}
