package venta.mediopago;

/**
 * Interfaz para representar los medios de pago de las ventas.
 */
public interface MedioPago {

  /**
   * Modifica el precio agregando cargos segun el medio de pago.
   * @param precio el precio de un item comprable.
   * @return el precio con los cargos correspondientes.
   */
  Double modificarPrecio(Double precio);
}
