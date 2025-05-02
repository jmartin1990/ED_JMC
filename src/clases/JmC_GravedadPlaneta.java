package clases;

/**
 * Clase que representa un planeta con su gravedad asociada.
 * Permite almacenar y gestionar información sobre la gravedad de diferentes planetas.
 * @author Juan Campos (JMC)
 * @version 1.0
 */
public class JmC_GravedadPlaneta {
    private int id;                // Identificador único del planeta
    private String nombre;         // Nombre del planeta
    private double GravedadPlaneta; // Gravedad del planeta en m/s²

    /**
     * Constructor por defecto de la clase JmC_GravedadPlaneta.
     */
    public JmC_GravedadPlaneta() {
        // Constructor vacío para inicialización básica
    }

    /**
     * Constructor parametrizado de la clase JmC_GravedadPlaneta.
     * @param id Identificador único del planeta (entero).
     * @param nombre Nombre del planeta (String).
     * @param gravedadPlaneta Gravedad del planeta en metros por segundo al cuadrado (m/s²).
     */
    public JmC_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
        this.id = id;
        this.nombre = nombre;
        this.GravedadPlaneta = gravedadPlaneta;
    }

    /**
     * Obtiene el ID del planeta.
     * @return ID (entero).
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del planeta.
     * @param id Nuevo ID (entero).
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del planeta.
     * @return Nombre (String).
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del planeta.
     * @param nombre Nuevo nombre (String).
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la gravedad del planeta.
     * @return Gravedad en metros por segundo al cuadrado (m/s²).
     */
    public double getGravedadPlaneta() {
        return GravedadPlaneta;
    }

    /**
     * Establece la gravedad del planeta.
     * @param gravedadPlaneta Nueva gravedad en metros por segundo al cuadrado (m/s²).
     */
    public void setGravedadPlaneta(double gravedadPlaneta) {
        this.GravedadPlaneta = gravedadPlaneta;
    }

    /**
     * Representación en String de los datos del planeta.
     * @return Cadena con el formato: "JmC_GravedadPlaneta [id=..., nombre=..., GravedadPlaneta=...]".
     */
    @Override
    public String toString() {
        return "JmC_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
    }
}