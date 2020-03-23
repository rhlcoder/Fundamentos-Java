package app;

import java.util.Date;

/**
 * Cliente
 */
public class Cliente extends Persona {
  // propiedades
  private int idCliente;
  private Date fechaRegistro;
  private boolean vip;
  private static int contadorClientes;

  // constructor

  public Cliente(Date fechaRegistro, boolean vip) {
    this.idCliente = ++contadorClientes;
    this.fechaRegistro = fechaRegistro;
    this.vip = vip;

  }

  // metodos
  public int getIdCliente() {
    return idCliente;
  }

  public Date getFechaRegistro() {
    return fechaRegistro;
  }

  // public void setFechaRegistro(Date fechaRegistro) {
  // this.fechaRegistro = fechaRegistro;
  // }

  public boolean isVip() {
    return vip;
  }

  public void setVip(boolean vip) {
    this.vip = vip;
  }

  @Override
  public String toString() {
    return super.toString() + "Cliente [fechaRegistro=" + fechaRegistro + ", idCliente=" + idCliente + ", vip=" + vip
        + "]";
  }

}
