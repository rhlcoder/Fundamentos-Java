package app;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Continente: " + Continentes.AFRICA);
        System.out.println("Paises en Africa: " + Continentes.AFRICA.getPaises());
        System.out.println("\n<><> Usando el metodo .values() <><>");
        imprimirContinentes();
        imprimirStream();

    }

    public enum Continentes {
        AFRICA(53),
        EUROPA(46),
        ASIA(44),
        AMERICA(34),
        OCEANIA(14);

        // atributo de cada elemento de una enumeracion
        private final int paises;

        // constructor de cada elemento
        private Continentes(int paises) {
            this.paises = paises;
        }

        public int getPaises(){
            return paises;
        }
    }

    public static void imprimirContinentes() {
        for(Continentes c : Continentes.values()){
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + " paises");
        }
        
    }

    // Usando streams
    public static void imprimirStream() {
        System.out.println("Opcion 1 --Stream.of()--");
        Stream.of(Continentes.values())
            .forEach(System.out::println);

        System.out.println("Opcion 2 --Arrays.stream() -- ");
        Arrays.stream(Continentes.values())
            .map(Continentes::getPaises) // extraigo el nro de paises
            .forEach(System.out::println);


    }
}
