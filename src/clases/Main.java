package clases;

/**
 * Clase principal que demuestra el cálculo del peso de personas en diferentes planetas.
 * Utiliza las clases Persona_JmC y JmC_GravedadPlaneta para realizar los cálculos.
 * @author Juan Campos (JMC)
 * @version 1.0
 */
public class Main {
    
    // Constantes para las gravedades de los planetas (en m/s²)
    /** Gravedad estándar en la Tierra (9.81 m/s²) */
    public static final double GRAVEDAD_TIERRA = 9.81;
    
    /** Gravedad estándar en Marte (3.72 m/s²) */
    public static final double GRAVEDAD_MARTE = 3.72;
    
    /** Gravedad estándar en Júpiter (24.79 m/s²) */
    public static final double GRAVEDAD_JUPITER = 24.79;

    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Creación de objetos Persona
        Persona_JmC pers1 = new Persona_JmC(1, "Papa", 85, 1.75, 22);
        Persona_JmC pers2 = new Persona_JmC(2, "Pepe", 75, 1.80, 25);

        // Creación de objetos Planeta con las constantes de gravedad
        JmC_GravedadPlaneta plan1 = new JmC_GravedadPlaneta(1, "Tierra", GRAVEDAD_TIERRA);
        JmC_GravedadPlaneta plan2 = new JmC_GravedadPlaneta(2, "Marte", GRAVEDAD_MARTE);
        JmC_GravedadPlaneta plan3 = new JmC_GravedadPlaneta(3, "Jupiter", GRAVEDAD_JUPITER);

        // Cálculo del peso para la persona 1 en diferentes planetas
        double masaPersona = pers1.getMasa();
        double pesoTierra = masaPersona * plan1.getGravedadPlaneta();
        double pesoMarte = masaPersona * plan2.getGravedadPlaneta();
        double pesoJupiter = masaPersona * plan3.getGravedadPlaneta();

        // Mostrar información de las personas y planetas
        System.out.println(pers1);
        System.out.println("El IMC de la persona " + pers1.getNombre() + " es " + pers1.calcularIMC());
        System.out.println(pers2);
        System.out.println("El IMC de la persona " + pers2.getNombre() + " es " + pers2.calcularIMC());
        
        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);
        
        // Mostrar pesos calculados
        System.out.println("Peso " + pers1.getNombre() + " en tierra: " + pesoTierra + " N");
        System.out.println("Peso " + pers1.getNombre() + " en marte: " + pesoMarte + " N");
        System.out.println("Peso " + pers1.getNombre() + " en jupiter: " + pesoJupiter + " N");

        // Cálculo y muestra de pesos para la persona 2
        double masaPersona2 = pers2.getMasa();
        System.out.println("Peso " + pers2.getNombre() + " en tierra: " + (masaPersona2 * plan1.getGravedadPlaneta()) + " N");
        System.out.println("Peso " + pers2.getNombre() + " en marte: " + (masaPersona2 * plan2.getGravedadPlaneta()) + " N");
        System.out.println("Peso " + pers2.getNombre() + " en jupiter: " + (masaPersona2 * plan3.getGravedadPlaneta()) + " N");
    }
}