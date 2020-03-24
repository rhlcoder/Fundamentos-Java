package app;

public class Empleado {

  // atributos
  protected String nombre;
  protected double sueldo;

  // constructor
  public Empleado(String nombre, double sueldo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

  // getters & setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  // metodos
public String obtenerDetalles() {
  return "Nombre: " + nombre + ", sueldo: " + sueldo;
}
}
