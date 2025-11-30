package cl.salmontt.model;

/**
* Superclase que entrega nombre y comuna
*/

public class UnidadOperativa {

    //Atributos privados
    String nombre;
    String comuna;

    /**
    * @param nombre     nombre de la unidad operativa
    * @param comuna     comuna donde está ubicada
    */

    //Constructor
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nComuna: " + comuna;
    }
}
