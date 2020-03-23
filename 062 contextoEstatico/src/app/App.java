package app;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Puff");
        System.out.println("\nPersona1: " + p1);
        
        Persona p2 = new Persona("Paff");
        System.out.println("Persona1: " + p2);

        System.out.println("Nro de Personas: " + Persona.getContadorPersonas());
    }
}
