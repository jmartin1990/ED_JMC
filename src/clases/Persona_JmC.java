package clases;

/**
 * Clase que representa a una persona con atributos como ID, nombre, masa, altura y edad.
 * Permite calcular el IMC (Índice de Masa Corporal) y gestionar los datos personales.
 * @author Juan Campos (JMC)
 * @version 1.0
 */
public class Persona_JmC {
	private int id;
	private String nombre;
	private double masa;
	private double altura;
	private int edad;
	/**
     * Constructor por defecto de la clase Persona_JmC.
     */
	public Persona_JmC() {
		// TODO Auto-generated constructor stub
	}
	/**
     * Constructor parametrizado de la clase Persona_JmC.
     * @param id Identificador único de la persona (entero).
     * @param nombre Nombre completo de la persona (String).
     * @param masa Masa corporal en kilogramos (kg).
     * @param altura Altura en metros (m).
     * @param edad Edad en años (entero).
     */
	public Persona_JmC(int id, String nombre, double masa, double altura, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.masa = masa;
		this.altura = altura;
		this.edad = edad;
	}
	 /**
     * Obtiene el ID de la persona.
     * @return ID (entero).
     */
	public int getId() {
		return id;
	}
	/**
     * Establece el ID de la persona.
     * @param id Nuevo ID (entero).
     */
	public void setId(int id) {
		this.id = id;
	}
	/**
     * Obtiene el nombre de la persona.
     * @return Nombre (String).
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * Establece el nombre de la persona.
     * @param nombre Nuevo nombre (String).
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la masa corporal de la persona.
     * @return Masa en kilogramos (kg).
     */
    public double getMasa() {
        return masa;
    }

    /**
     * Establece la masa corporal de la persona.
     * @param masa Nueva masa en kilogramos (kg).
     */
    public void setMasa(double masa) {
        this.masa = masa;
    }

    /**
     * Obtiene la altura de la persona.
     * @return Altura en metros (m).
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura de la persona.
     * @param altura Nueva altura en metros (m).
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Obtiene la edad de la persona.
     * @return Edad en años (entero).
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * @param edad Nueva edad en años (entero).
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC) de la persona.
     * Fórmula: IMC = masa (kg) / (altura (m) * altura (m)).
     * @return Valor del IMC (double).
     */
    public double calcularIMC() {
        return masa / (altura * altura);
    }

    /**
     * Representación en String de los datos de la persona.
     * @return Cadena con el formato: "Persona_JmC [id=..., nombre=..., masa=..., altura=..., edad=...]".
     */
    @Override
    public String toString() {
        return "Persona_JmC [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad=" + edad + "]";
    }
}
