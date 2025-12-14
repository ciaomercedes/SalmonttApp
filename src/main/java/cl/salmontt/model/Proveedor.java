package cl.salmontt.model;

/*
Clase para crear cada proveedor de la empresa Samontt para posteriormente registrador con la interfaz Registrable
 */

public class Proveedor implements Registrable {

    private String nombre;
    private String rubro;

    public Proveedor(String nombre, String rubro) {
        this.nombre = nombre;
        this.rubro = rubro;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Proveedor: " + nombre + " - rubro: " + rubro);
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + " (" + rubro +")";
    }

}
