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
    public String toString() {
        return ">>> PLANTA DE PROCESO <<<\n" +
                super.toString() +
                "\nCapacidad de Proceso: " + capacidadProceso + " t/día" +
                "\nExporta?: " + (exporta ? "Sí" : "No") +
                "\n--------------------------------------------";
        }


}
