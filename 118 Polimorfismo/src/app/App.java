package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        
        Empleado emp = new Empleado("Rick", 78);
        imprimirDetalles(emp);

        Gerente ger = new Gerente  ("Mortimerto", 34, "Research");
        imprimirDetalles(ger);

    }

    // El tipo que recibe el metodo es de tipo padre (Empleado)
    // Al momento de ejecutar el metodo, se ejecuta el hijo (Gerente)
    // Eso es polimorfismo, multiples formas pero en tiempo de ejcucion
    private static void imprimirDetalles(Empleado emp) {
        System.out.println(emp.obtenerDetalles());
    }
}
