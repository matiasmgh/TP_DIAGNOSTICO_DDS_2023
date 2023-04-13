package prenda;

import prenda.estado.EstadoPrenda;

/**
 * Clase que representa una prenda.
 */
public class Prenda {
  TipoPrendaEnum tipoPrenda;
  Double precioBase;
  EstadoPrenda estado;

  /**
   * Constructor completo.
   *
   * @param tipoPrenda tipo de la prenda.
   * @param precioBase el precio base de la prenda.
   * @param estado     el estado de promocion de la prenda.
   */
  public Prenda(TipoPrendaEnum tipoPrenda, Double precioBase, EstadoPrenda estado) {
    this.tipoPrenda = tipoPrenda;
    this.precioBase = precioBase;
    this.estado = estado;
  }

  /**
   * Calcula el precio de la prenda considerando su estado.
   *
   * @return el precio de la prenda.
   */
  public Double calcularPrecioPrenda() {
    return estado.modificarPrecio(precioBase);
  }

  /**
   * Obtiene el tipo de prenda.
   *
   * @return el tipo de la prenda.
   */
  public TipoPrendaEnum getTipoPrenda() {
    return tipoPrenda;
  }
}
