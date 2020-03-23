package app;

public class App {
    public static void main(String[] args) throws Exception {
        // creamos el objeto
        Persona p1 = new Persona("Rolf", "Sigurdisdottir", false);
        // accedemos al atributo nombre
        System.out.println("Nombre: " + p1.getNombre());
        
        // creamos el objeto
        Persona p2 = new Persona("Mark", "Fluffykins", false);
        // imprimimos el estado completo del objeto
        System.out.println("Estado de p2: " + p2);

        // marcamos como borrada a la persona 2
        p2.setBorrado(true);
        // imprimimos el estado completo del objeto
        System.out.println("Estado de p2: " + p2);
        
        // creamos el objeto
        Persona p3 = new Persona();
        // imprimimos el estado completo del objeto
        System.out.println("Estado de p3: " + p3);
    }
}
