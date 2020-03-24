package app;

public class App {
    public static void main(final String[] args) throws Exception {

        imprimirNumeros(15, 20, 3, 61, 75, 18, 10);
    }

    /**
     * Imprime un array de numeros variables. Usando la sintaxis "..."
     * 
     * @param numeros []
     */
    private static void imprimirNumeros(final int... numeros) {
        // Si voy a recorrer todos los elementos y a incrementar
        // de a uno, puedo usar esta sintaxis de "for"
        // Tampoco tengo acceso al index
        for (final int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }
    }
}
