package app;

public class Persona{

  private String nombre;
  private int idPersona;
  private static int contadorPersonas;

  public Persona(String nombre) {
    // cada vez que creamos un objeto persona, incrementa idPersona
    contadorPersonas++;
    idPersona = contadorPersonas;
    this.nombre = nombre;    
  }

  @Override
  public String toString() {
    return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
  }


  public static int getContadorPersonas() {
    return contadorPersonas;
  }
}
