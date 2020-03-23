package app;

/**
  * Persona
  */
public class Persona {

  // atributos
  private String nombre;
  private String apellido;
  private boolean borrado;

  // constructor vacio
  public Persona() {
  }

  // constructor con argumentos
  public Persona(String nombre, String apellido, boolean borrado) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.borrado = borrado;
  }

  // getters 
  public String getNombre()  {return nombre;}
  public String getApellido() {return apellido ;}
  public boolean isBorrado() {return borrado ;}
  // setters
  public void setNombre (String nombre)  {this.nombre  = nombre ;}
  public void setApellido(String apellido) {this.apellido = apellido ;}
  public void setBorrado (boolean borrado) {this.borrado = borrado ;}
  
  // Metodoque imprime el estado del objeto
  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + "}";
  }
}
