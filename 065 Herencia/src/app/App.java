package app;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado e1 = new Empleado("Chiliendre", 105000);
        System.out.println("\n\nImprimimos el objeto empleado1");
        System.out.println(e1);

        Empleado e2 = new Empleado("Ramongo", 100);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Argentina");
        System.out.println("\nImprimimos el objeto empleado2");
        System.out.println(e2);

        Cliente c1 = new Cliente(new Date(), false);
        System.out.println("Imprimimos el objeto Cliente1");
        System.out.println(c1);

        c1.setNombre("Calamarcos");
        c1.setEdad(198);
        c1.setGenero('M');
        c1.setDireccion("Al fondo");
        System.out.println("Volvemos a imprimir el objeto Cliente1");
        System.out.println(c1);

    }
}
