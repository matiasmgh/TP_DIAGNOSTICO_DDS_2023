package prenda.estado;

/**
 * Estado de liquidacion de una prenda.
 */
public class EstadoLiquidacion implements EstadoPrenda {

  public static final double DESCUENTO_LIQUIDACION = 0.50;

  @Override
  public Double modificarPrecio(Double precio) {
    return precio * DESCUENTO_LIQUIDACION;
  }
}
