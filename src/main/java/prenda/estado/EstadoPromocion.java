package prenda.estado;

/**
 * Estado en promocion/descuento de una prenda.
 */
public class EstadoPromocion implements EstadoPrenda {

  private final Double descuentoFijo;

  /**
   * Constructor.
   *
   * @param descuentoFijo el valor concreto de descuento por promocion.
   */
  public EstadoPromocion(Double descuentoFijo) {
    this.descuentoFijo = descuentoFijo;
  }

  @Override
  public Double modificarPrecio(Double precio) {
    return precio - descuentoFijo;
  }
}
