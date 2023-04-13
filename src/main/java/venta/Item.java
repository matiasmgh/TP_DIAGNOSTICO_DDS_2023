package venta;

import prenda.Prenda;

/**
 * Un item comprable, que consiste en una prenda y una cantidad.
 */
public class Item {

  Prenda prenda;
  Integer cantidad;

  /**
   * Constructor completo.
   *
   * @param prenda   una prenda a comprar.
   * @param cantidad la cantidad deseada de esa prenda.
   */
  public Item(Prenda prenda, Integer cantidad) {
    this.prenda = prenda;
    this.cantidad = cantidad;
  }

  /**
   * Calcula el precio del item tomando en cuenta la cantidad. No contempla recargos por
   * medio de pago.
   *
   * @return el precio del item.
   */
  public Double calcularPrecioItem() {
    return prenda.calcularPrecioPrenda() * cantidad;
  }
}
