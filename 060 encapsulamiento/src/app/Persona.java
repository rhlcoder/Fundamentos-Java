package app;

import java.util.stream.IntStream;

/**
 * Persona
 */
public class Persona {

  // atributos
  private String nombre;
  private int mes = -1;

  // getter
  public String getNombre() {
    return nombre;
  }

  // setter
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mesNacimiento) {
    final int ENERO = 1;
    final int DICIEMBRE = 13;

    if (IntStream.range(ENERO,DICIEMBRE).anyMatch(mes -> mes == mesNacimiento)) {
      this.mes = mesNacimiento;
    }
  }

}
