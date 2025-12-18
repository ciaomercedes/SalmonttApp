package cl.salmontt.model;

/**
* Clase que representa un centro de cultivo de la empresa salmonera Salmontt.
* Aqui se guardan sus datos operacionales
+ */

public class CentroCultivo extends UnidadOperativa implements Registrable {

    // Atributos privados
    private String idCentro;
    private int toneladasProduccion;
    private double profundidadAgua;
    private double salinidad;
    private String tipoSalmon;

    /**
     * @param idCentro              identificador único del centro
     * @param toneladasProduccion   toneladas producidas
     * @param profundidadAgua       medido en metros
     * @param salinidad             medido en PSU (Unidades Prácticas de Salinidad = Gr. de sal por Kg. de agua)
     * @param tipoSalmon            tipo de salmon que se cosecha
     */


    //Constructor con parámetros que inicializa todos los campos del centro.

    public CentroCultivo(String idCentro, String nombre, String comuna, int toneladasProduccion,
                         double profundidadAgua, double salinidad, String tipoSalmon) {
        super(nombre, comuna);
        this.idCentro = idCentro;
        this.toneladasProduccion = toneladasProduccion;
        this.profundidadAgua = profundidadAgua;
        this.salinidad = salinidad;
        this.tipoSalmon = tipoSalmon;
    }

    //getter y setter para los filtros en la clase principal

    public String getTipoSalmon() {
        return tipoSalmon;
    }

    public int getToneladas() {
        return toneladasProduccion;
    }

    public String getIdCentro() {
        return idCentro;
    }

    /**
     * Devuelve una representacion textual del centro,
     *
     */

    @Override
    public void mostrarResumen() {
        System.out.println("Centro de Cultivo: " + getNombre() + ", ID: " + idCentro);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return ">>> CENTRO DE CULTIVO <<<\n" +
                "\nID Centro: " + idCentro +
                super.toString() +
                "\nProducción: " + toneladasProduccion + " t." +
                "\nProfundidad del Agua: " + profundidadAgua + " mts." +
                "\nSalinidad: " + salinidad + " PSU" +
                "\nTipo de salmón: " + tipoSalmon +
                "\n---------------------------";
    }

}
