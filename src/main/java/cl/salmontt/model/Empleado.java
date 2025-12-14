package cl.salmontt.model;

/*
Clase para crear cada empelado de la empresa Samontt para posteriormente registrador con la interfaz Registrable
 */

public class Empleado implements Registrable {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Empleado: " + nombre + " - Cargo: " + cargo);
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " - " + cargo;
    }
}
