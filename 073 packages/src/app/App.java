package app;

// se importa el paquete desde com/gm/
import com.gm.*;

// ejemplo de import estatico, toma directamente el metodo
// dentro de la clase
import static com.gm.UtileriaStatic.imprimirEstatico;


public class App {
    public static void main(String[] args) throws Exception {
        Utileria.imprimir("Hola");

        imprimirEstatico("Hola estatico!");
    }
}
