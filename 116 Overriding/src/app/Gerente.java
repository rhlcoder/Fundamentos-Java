package app;

/**
 * Gerente
 */
public class Gerente extends Empleado {

  // atributos
  private String departamento;

  // constructor
  public Gerente(final String nombre, final double sueldo, final String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  // getters & setters
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(final String departamento) {
    this.departamento = departamento;
  }

  // metodo a sobreescribir (Override)
  public String obtenerDetalles(){

    // Podemos acceder directamente a los atributos 'nombre' y 'sueldo' porque
    // los declaramos como 'protected' en la clase padre (Empleado)

    return "\nUsando override:\n" + "Nombre: " + nombre + ", sueldo: " + sueldo + ", departamento: " + departamento;
  }
  
  public String obtenerSuperDetalles(){

    // usando super, obtengo el metodo de la clase padre

    return "\nUsando super:\n" + super.obtenerDetalles() + ", departamento: " + departamento;
  }
  
}
