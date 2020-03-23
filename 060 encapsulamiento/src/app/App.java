package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(final String[] args) throws Exception {
        // creacion de opbjeto
        Persona p1 = new Persona();
        // asigno valor con setter
        p1.setNombre("Juan");
        // leo el valor con getter
        System.out.println("Nombre: " + p1.getNombre());
        // quiero ver si se puede validar el mes desde el setter
        p1.setMes(5);
        // leo el valor con getter
        System.out.println("Mes: " + p1.getMes());
}
}
