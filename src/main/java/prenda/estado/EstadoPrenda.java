package prenda.estado;

/**
 * Interfaz para representar los estados de promocion de las prendas.
 */
public interface EstadoPrenda {

  /**
   * Modifica el precio de una prenda aplicando un descuento, si lo hay.
   *
   * @param precio el precio base de una prenda.
   * @return el precio con descuento.
   */
  Double modificarPrecio(Double precio);
}
