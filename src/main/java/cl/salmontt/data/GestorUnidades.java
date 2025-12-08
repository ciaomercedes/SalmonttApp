package cl.salmontt.data;

/*
 * Clase la cual crea instancias de prueba de la jerarquía.
*/

import cl.salmontt.model.UnidadOperativa;
import cl.salmontt.model.PlantaProceso;
import cl.salmontt.model.CentroCultivo;

import java.util.ArrayList;

public class GestorUnidades {

    public ArrayList<UnidadOperativa> obtenerUnidadesPrueba() {

        ArrayList<UnidadOperativa> unidades = new ArrayList<>();

        //agregar centros de cultivo
        unidades.add(new CentroCultivo(
                "C001", "Centro Trucha Azul", "Puerto Varas", 1200, 35, 28.5, "Coho"));

        unidades.add(new CentroCultivo(
                "C002", "Centro Bahía Serena", "Puerto Montt", 980, 42, 30.2, "Atlántico"));

        //agregar plantas de proceso
        unidades.add(new PlantaProceso(
                "Planta Sur", "Calbuco", 350, true));

        unidades.add(new PlantaProceso(
                "Planta Norte", "Aysén", 220, false));

        return unidades;
    }
}
