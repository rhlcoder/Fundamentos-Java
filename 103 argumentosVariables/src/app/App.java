package app;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        imprimirNumeros(1, 2, 3, 4, 5, 6);
        System.out.println("");
        printNumerosForEach(7, 8, 9);
        System.out.println("");
        parametrosDiferentes("Sandro", false, 67, 78, 89, 90);
    }

    /**
     * Imprime una lista de argumentos variables usando for clasico
     * 
     * @param numeros
     */
    public static void imprimirNumeros(int... numeros) {

        int numero;
        for (int i = 0; i < numeros.length; i++) {
            numero = numeros[i];
            System.out.println("nros: " + numero);
        }
    }

    /**
     * Imprime una lista de argumentos variables usando forEach
     * 
     * @param numeros
     */
    public static void printNumerosForEach(int... numeros) {
        for (int numero : numeros) {
            System.out.println("nros: " + numero);
        }
    }

    /**
     * Solo para demostrar que los "varArgs" deben ir al final en la lista de
     * parametros
     * 
     * @param nombre
     * @param vivo
     * @param numeros
     */
    public static void parametrosDiferentes(String nombre, boolean vivo, int... numeros) {
        System.out.println("Nombre: " + nombre);
        // System.out.println("Esta vivo? " + (vivo ? "Si, por ahora 🤞" : "No, ya ripeó ☠"));
        String c = new String(Character.toChars(0x1F480));
        JOptionPane.showMessageDialog(null, "Esta vivo? " + (vivo ? "Si, por ahora 🤞" : "No, ya ripeó " + c));
        for (int numero : numeros) {
            System.out.println("nros: " + numero);
        }

    }
}
