package clases;

public class Main {
	
    // Constantes para las gravedades de los planetas (en m/s²)
    public static final double GRAVEDAD_TIERRA = 9.81;
    public static final double GRAVEDAD_MARTE = 3.72;
    public static final double GRAVEDAD_JUPITER = 24.79;

    public static void main(String[] args) {
    	Persona_JmC pers1 = new Persona_JmC(1, "Papa", 85, 1.75, 22);
        Persona_JmC pers2 = new Persona_JmC(2, "Pepe", 75, 1.80, 25);

        JmC_GravedadPlaneta plan1 = new JmC_GravedadPlaneta(1, "Tierra", GRAVEDAD_TIERRA);
        JmC_GravedadPlaneta plan2 = new JmC_GravedadPlaneta(2, "Marte", GRAVEDAD_MARTE);
        JmC_GravedadPlaneta plan3 = new JmC_GravedadPlaneta(3, "Jupiter", GRAVEDAD_JUPITER);

        // Masa de la persona (es la misma en todos los planetas)
        double masaPersona = pers1.getMasa();

        // Peso en Tierra
        double pesoTierra = masaPersona * plan1.getGravedadPlaneta();

        // Peso en Marte
        double pesoMarte = masaPersona * plan2.getGravedadPlaneta();

        // Peso en Júpiter
        double pesoJupiter = masaPersona * plan3.getGravedadPlaneta();

        // Imprimir información
        System.out.println(pers1);
        System.out.println("El INC de la persona " + pers1.getNombre() + " es ...");
        System.out.println(pers2);
        System.out.println("El INC de la persona " + pers2.getNombre() + " es ...");
        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);
        System.out.println("Peso " + pers1.getNombre() + " en tierra: " + pesoTierra);
        System.out.println("Peso " + pers1.getNombre() + " en marte: " + pesoMarte);
        System.out.println("Peso " + pers1.getNombre() + " en jupiter: " + pesoJupiter);

        // También calcular y mostrar pesos para pers2 (opcional)
        double masaPersona2 = pers2.getMasa();
        System.out.println("Peso " + pers2.getNombre() + " en tierra: " + (masaPersona2 * plan1.getGravedadPlaneta()));
        System.out.println("Peso " + pers2.getNombre() + " en marte: " + (masaPersona2 * plan2.getGravedadPlaneta()));
        System.out.println("Peso " + pers2.getNombre() + " en jupiter: " + (masaPersona2 * plan3.getGravedadPlaneta()));
    }
}