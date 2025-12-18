package cl.salmontt.model;

/*
Clase que crea una dirección con su nombre, numero, tipo domicilio y numeracion.
 */

public class Direccion {

    //Atributos privados
    String direccion;
    int numero;
    String tipoDireccion;
    String numeroInterno;
    String comuna;
    String region;

    /**
     * @param direccion         se refiere al nombre de la calle o avenida
     * @param numero            se refiere a la numeración del domicilio
     * @param tipoDireccion     tipo domicilio: si es casa, departamento u oficina
     * @param numeroInterno     numero del depto u oficina
     * @param comuna            comuna donde está ubicada la direccion
     * @param region            region donde está ubicada la dirección
     */

    //Constructor
    public Direccion(String direccion, int numero, String tipoDireccion, String numeroInterno, String comuna, String region) {
        this.direccion = direccion;
        this.numero = numero;
        this.tipoDireccion = tipoDireccion;
        this.numeroInterno = numeroInterno;
        this.comuna = comuna;
        this.region = region;
    }

    //Getters&Setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String toString() {
        return "\nDirección: " + direccion + ", " +  numero + ", " + tipoDireccion + ", " + numeroInterno;
    }
}
