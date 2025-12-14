package cl.salmontt.model;

/**
* Superclase que entrega nombre y comuna. Superclase del tipo abstracta para que no se puedan crear instancias directas
*/

public abstract class UnidadOperativa {

    //Atributos protegidos
    protected String nombre;
    protected String comuna;

    /**
    * @param nombre     nombre de la unidad operativa
    * @param comuna     comuna donde está ubicada
    */

    //Constructor
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public abstract void mostrarInformacion(); //obliga a todas las subclases a definir su propia version

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
