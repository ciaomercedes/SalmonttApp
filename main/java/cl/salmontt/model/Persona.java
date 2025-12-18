package cl.salmontt.model;

public abstract class Persona implements Registrable {

    //Atributos protegidos
    protected String nombre;
    protected String apellido;
    protected String rut;
    private Direccion direccion;

    //Constructor
    public Persona(String nombre, String apellido, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() { return rut; }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
