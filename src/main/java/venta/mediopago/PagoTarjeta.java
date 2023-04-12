package venta.mediopago;

/**
 * Clase que representa los pagos con tarjeta.
 */
public class PagoTarjeta implements MedioPago {

  private final Integer cantidadCuotas;

  private final Double coeficienteFijo;

  /**
   * Constructor completo.
   *
   * @param cantidadCuotas cantidad de cuotas deseadas.
   * @param coeficienteFijo un coeficiente fijo para el calculo del recargo.
   */
  public PagoTarjeta(Integer cantidadCuotas, Double coeficienteFijo) {
    this.cantidadCuotas = cantidadCuotas;
    this.coeficienteFijo = coeficienteFijo;
  }

  @Override
  public Double modificarPrecio(Double precio) {
    return precio + getRecargo(precio);
  }

  private Double getRecargo(Double precio) {
    return cantidadCuotas * coeficienteFijo * precio * 0.01;
  }
}
