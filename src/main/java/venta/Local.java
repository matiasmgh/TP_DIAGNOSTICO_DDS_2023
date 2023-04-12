package venta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un local de venta al publico.
 */
public class Local {

  private final List<Venta> historialVentas = new ArrayList<>();


  /**
   * Calcula las ganancias para una fecha.
   *
   * @param fecha la fecha a calcular
   * @return el monto de ganancias.
   */
  public Double calcularGananciasPorFecha(LocalDate fecha) {
    return this.historialVentas.stream().filter(venta -> venta.esDeFecha(fecha))
        .mapToDouble(Venta::calcularPrecioFinal).sum();
  }

  /**
   * Suma una venta al local.
   *
   * @param venta la venta realizada.
   */
  public void agregarVenta(Venta venta) {
    this.historialVentas.add(venta);
  }
}
