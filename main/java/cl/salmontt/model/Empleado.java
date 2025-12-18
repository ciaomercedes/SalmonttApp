package cl.salmontt.model;

/*
Clase para crear cada empelado de la empresa Samontt para posteriormente registrador con la interfaz Registrable
 */

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String nombre, String apellido, String rut, Direccion direccion, String cargo) {
        super(nombre, apellido, rut, direccion);
        this.cargo = cargo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Empleado: " + nombre + " " + apellido + ". RUT: " + rut + " - Cargo: " + cargo + ". " +
                "Dirección: " + getDireccion()
        );
    }

    @Override
    public String toString() {
        return "---------------------------" +
                "Empleado: " + nombre + " " + apellido +
                "\nRUT: " + rut +
                "\nCargo: " + cargo +
                "\nDirección: " + (getDireccion() != null ? getDireccion().toString() : "N/A") +
                "\n---------------------------";
    }
}
