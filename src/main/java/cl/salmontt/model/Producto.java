package cl.salmontt.model;

public class Producto {

    //Atributos privados
    private int codigo;
    private String tipo;
    private String nombre;
    private String localidad;
    private boolean artesanal;
    private double precioUnitario;
    private int stock;

    /**
     * @param codigo            id unico del producto
     * @param tipo              tipo de pez
     * @param nombre            nombre del tipo de salmón
     * @param localidad         region donde está ubicado el centro de pesca
     * @param artesanal         booleano para validar si es pescado artesanalmente
     * @param precioUnitario    costo unitario
     * @param stock             existencias
     */

    //Constructor
    public Producto(int codigo, String tipo, String nombre, String localidad, boolean artesanal, double precioUnitario,  int stock) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.localidad = localidad;
        this.artesanal = artesanal;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    //muestro en texto con el metodo toString la lista de productos
    @Override
    public String toString() {
        return "\nID Producto: " + codigo +
                "\nTipo: " + tipo +
                "\nNombre: " + nombre +
                "\nRegión: " + localidad +
                "\n¿Producto artesanal?: " + artesanal +
                "\nPrecio unitario: $" + precioUnitario +
                "\nExistencias: " + stock + " unidades" +
                "\n----------------------------------------------------------------------------";
    }

}
