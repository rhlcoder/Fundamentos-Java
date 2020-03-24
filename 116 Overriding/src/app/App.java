package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nUsando el metodo original:");

        Empleado empleado = new Empleado("Fluberto", 56);
        System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Detergerente", 57, "Reparto de volantes");
        System.out.println(gerente.obtenerDetalles());

        System.out.println(gerente.obtenerSuperDetalles());
    }
}
