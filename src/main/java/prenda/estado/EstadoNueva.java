package prenda.estado;

/**
 * Estado de promocion de una prenda nueva.
 */
public class EstadoNueva implements EstadoPrenda {

  @Override
  public Double modificarPrecio(Double precio) {
    return precio;
  }
}
