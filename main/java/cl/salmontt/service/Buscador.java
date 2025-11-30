package cl.salmontt.service;

/**
 * La clase 'Buscador' permitirá hacer la búsqueda por ID, tipo de salmón, producción o todos los centros
 * Así mismo, almacena el metodo para buscar productos por nombre
 */

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Producto;
import java.util.ArrayList;

public class Buscador {

    //Buscar todos los centros
    public static ArrayList<CentroCultivo> buscarTodosLosCentros(ArrayList<CentroCultivo> centros) {
        ArrayList<CentroCultivo> centrosSalmontt = new ArrayList<>();
        for (CentroCultivo centro : centros) {
            if (centro.getNombre().contains("Centro")) {
                centrosSalmontt.add(centro);
            }
        }
        return centrosSalmontt;
    }

    //Buscar centros por identificador (ID)
    public static ArrayList<CentroCultivo> buscarPorId(ArrayList<CentroCultivo> centros, String idCentro) {
        ArrayList<CentroCultivo> centrosConId = new ArrayList<>();
        for  (CentroCultivo centro : centros) { //hacemos el recorrido por el archivo
            if (centro.getIdCentro().equals(idCentro)) {
                centrosConId.add(centro);
            }
        }
        return centrosConId;
    }

    //Buscar centros por tipo de salmón
    public static ArrayList<CentroCultivo> buscarPorTipoSalmon(ArrayList<CentroCultivo> centros, String tipoSalmon) {
        ArrayList<CentroCultivo> centrosTipoSalmon = new ArrayList<>(); // crearemos una nueva lista que almacenará los centros si se consigue con la condifición mas abajo
        for  (CentroCultivo centro : centros) {
            if (centro.getTipoSalmon().equalsIgnoreCase(tipoSalmon)) {
                centrosTipoSalmon.add(centro);
            }
        }
        return centrosTipoSalmon;
    }

    // Buscar centros con producción mayor o igual a 1000 toneladas
    public static ArrayList<CentroCultivo> buscarPorCienToneladas(ArrayList<CentroCultivo> centros) {
        ArrayList<CentroCultivo> centrosCienToneladas = new ArrayList<>();
        for  (CentroCultivo centro : centros) {
            if (centro.getToneladas() >= 1000) {
                centrosCienToneladas.add(centro);
            }
        }
        return centrosCienToneladas;
    }

    //Filtrar productos por nombre de salmón
    public static ArrayList<Producto> filtrarPorNombre(ArrayList<Producto> inventario, String nombreBuscado) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}
