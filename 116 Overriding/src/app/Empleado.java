package app;

/** 
 * Empleado
*/
public class Empleado {

  // atributos
  protected String nombre;
  protected double sueldo;

  // constructor
  protected Empleado(final String nombre, final double sueldo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

  // getters & setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(final double sueldo) {
    this.sueldo = sueldo;
  }

  // metodos
  public String obtenerDetalles(){
    return "Nombre: " + nombre + ", sueldo: " + sueldo;
  }

}
