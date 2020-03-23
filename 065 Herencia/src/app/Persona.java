package app;

/**
 * Persona
 */
public class Persona {

  // propiedades
  private String nombre;
  private char genero;
  private int edad;
  private String direccion;

  // constructor vacio
  public Persona() {
  }

  // constructor 1 argumento
  public Persona(String nombre) {
    this.nombre = nombre;
  }

  // constructor completo
  public Persona(String nombre, char genero, int edad, String direccion) {
    this.nombre = nombre;
    this.genero = genero;
    this.edad = edad;
    this.direccion = direccion;
  }

  // metodos
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;

  }

  @Override
  public String toString() {
    return "Persona [direccion=" + direccion + ", edad=" + edad + ", genero=" + genero + ", nombre=" + nombre + "]";
  }

}
