package app;

/**
 * Empleado
 */
public class Empleado extends Persona {

  // propiedades
  private int idEmpleado;
  private double sueldo;
  private static int contadorEmpleados;

  // Constructor que hereda nombre de la clase Persona
  public Empleado(String nombre, double sueldo) {
    super(nombre); // super debe ser la 1ra linea
    this.sueldo = sueldo;
    this.idEmpleado = ++contadorEmpleados;
  }

  // metodos
  public int getIdEmpleado() {
    return idEmpleado;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + "Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
  }

}
