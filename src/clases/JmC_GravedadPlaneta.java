package clases;

public class JmC_GravedadPlaneta {
	private int id;
	private String nombre;
	private double GravedadPlaneta;
	/**
	 * 
	 */
	public JmC_GravedadPlaneta() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombre
	 * @param gravedadPlaneta
	 */
	public JmC_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
		this.id = id;
		this.nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
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
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the gravedadPlaneta
	 */
	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}
	/**
	 * @param gravedadPlaneta the gravedadPlaneta to set
	 */
	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	@Override
	public String toString() {
		return "JmC_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
	
	

}
