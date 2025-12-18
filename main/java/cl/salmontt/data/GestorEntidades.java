package cl.salmontt.data;

/*
Clase que gestiona y guarda las entidades que se crean y se valida con el uso de instanceof
 */

import cl.salmontt.model.*;
import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    //Constructor de la lista
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }



    //metodo para agregar a la lista registrable
    public void agregarEntidad(Registrable reg) {
        entidades.add(reg);
    }

    public void  mostrarEntidades() {
        for (Registrable reg : entidades) {
            reg.mostrarResumen();

            //Validacion por tipo
            if (reg instanceof CentroCultivo) { //Uso del instanceof
                System.out.println(" → Entidad tipo Centro de Cultivo");
            } else if (reg instanceof Empleado) {
                System.out.println(" → Entidad tipo Empleado");
            }
        }
    }

    //metodo Getter
    public  ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}
