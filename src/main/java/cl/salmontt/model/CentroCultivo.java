package cl.salmontt.model;

/**
* Clase que representa un centro de cultivo de la empresa salmonera Salmontt.
* Aqui se guardan sus datos operacionales
+ */

public class CentroCultivo {

    // Atributos privados
    private String idCentro;
    private String nombre;
    private String comuna;
    private int toneladas;
    private double profundidadAgua;
    private double salinidad;
    private String tipoSalmon;

    /**
     * @param idCentro          identificador único del centro
     * @param nombre            nombre del centro
     * @param comuna            comuna donde está ubicado el centro
     * @param toneladas         toneladas producidas
     * @param profundidadAgua   medido en metros
     * @param salinidad         medido en PSU (Unidades Prácticas de Salinidad = Gr. de sal por Kg. de agua)
     * @param tipoSalmon    tipo de salmon que se cosecha
     */


    //Constructor con parámetros que inicializa todos los campos del centro.

    public CentroCultivo(String idCentro, String nombre, String comuna, int toneladas, double profundidadAgua, double salinidad, String tipoSalmon) {
        this.idCentro = idCentro;
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
        this.profundidadAgua = profundidadAgua;
        this.salinidad = salinidad;
        this.tipoSalmon = tipoSalmon;
    }

    //getter y setter para los filtros en la clase principal


    public String getNombre() {
        return nombre;
    }

    public String getTipoSalmon() {
        return tipoSalmon;
    }

    public int getToneladas() {
        return toneladas;
    }

    public String getIdCentro() {
        return idCentro;
    }

    /**
     * Devuelve una representacion textual del centro,
     *
     * @return informacion completa del centro
     */

    @Override
    public String toString(){
        return "ID Centro: " + idCentro +
                "\nNombre: " + nombre +
                "\nComuna: " + comuna +
                "\nProducción: " + toneladas + " t." +
                "\nProfundidad del Agua: " + profundidadAgua + " mts." +
                "\nSalinidad: " + salinidad + " PSU" +
                "\nTipo de salmón: " + tipoSalmon +
                "\n----------------------------------------------------------------------------";
    }
}
