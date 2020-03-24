package app;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  
  public String obtenerDetalles() {
    // Usamos el metodo de la clase Empleado y le agregamos departamento
    return super.obtenerDetalles() + ", departamento: " + departamento;
  }
}
