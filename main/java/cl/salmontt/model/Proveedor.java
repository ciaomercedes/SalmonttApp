package cl.salmontt.model;

/*
Clase para crear cada proveedor de la empresa Samontt para posteriormente registrador con la interfaz Registrable
 */

public class Proveedor extends Persona {

    private String rubro;

    public Proveedor(String nombre, String apellido, String rut, Direccion direccion, String rubro) {
        super(nombre, apellido, rut, direccion);
        this.rubro = rubro;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Proveedor: " + nombre + ". RUT: " + rut + " - rubro: " + rubro + "- Dirección: " + getDireccion());
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + ". RUT: " + rut + " ("+ rubro +"). Dirección: " + getDireccion();
    }

}
