package clases;

public class Persona_JmC {
	private int id;
	private int nombre;
	private double masa;
	private double altura;
	private int edad;
	/**
	 * 
	 */
	public Persona_JmC() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombre
	 * @param masa
	 * @param altura
	 * @param edad
	 */
	public Persona_JmC(int id, int nombre, double masa, double altura, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.masa = masa;
		this.altura = altura;
		this.edad = edad;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public int getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the masa
	 */
	public double getMasa() {
		return masa;
	}
	/**
	 * @param masa the masa to set
	 */
	public void setMasa(double masa) {
		this.masa = masa;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona_JmC [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
				+ edad + "]";
	}
	
	
}
