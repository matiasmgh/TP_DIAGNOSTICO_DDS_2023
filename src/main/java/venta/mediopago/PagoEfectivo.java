package venta.mediopago;

/**
 * Clase para representar los pagos en efectivo.
 */
public class PagoEfectivo implements MedioPago {

  @Override
  public Double modificarPrecio(Double precio) {
    // No hay cargos extra.
    return precio;
  }
}
