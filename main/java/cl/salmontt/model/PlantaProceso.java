package cl.salmontt.model;

/**
 * Clase que representa plantas de procesamiento de salmón y su función es ser subclase que hereda atributos de
 * @Link
 * UnidadOperativa
 */

public class PlantaProceso extends UnidadOperativa{

    //Atributos privados
    private int capacidadProceso;
    private boolean exporta;

    //Constructor
    public PlantaProceso(String nombre, String comuna, int capacidadProceso, boolean exporta) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
        this.exporta = exporta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(">>> PLANTA DE PROCESO <<<");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Comuna: " + getComuna());
        System.out.println("Capacidad Proceso: " + capacidadProceso + " t/día");
        System.out.println("Exporta?: " + (exporta ? "Si" : "No"));
        System.out.println("----------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return ">>> PLANTA DE PROCESO <<<\n" +
                super.toString() +
                "\nCapacidad de Proceso: " + capacidadProceso + " t/día" +
                "\nExporta?: " + (exporta ? "Sí" : "No") +
                "\n--------------------------------------------";
        }
}
