package transaccion;

import java.time.LocalDate;
import java.util.List;
import prenda.Prenda;

public class TransaccionTarjeta extends Transaccion {

  private final Short cuotas;
  private final Double coeficiente;

  /**
   * Constructor.
   *
   * @param prendas     lista de prendas compradas.
   * @param fecha       la fecha de la transaccion.
   * @param cuotas      la cantidad de cuotas.
   * @param coeficiente el coeficiente fijo asociado al calculo.
   */
  public TransaccionTarjeta(List<Prenda> prendas, LocalDate fecha, Short cuotas,
                            Double coeficiente) {
    super(prendas, fecha);
    this.cuotas = cuotas;
    this.coeficiente = coeficiente;
  }

  @Override
  public Double getMonto() {
    return this.prendas.stream()
        .mapToDouble(prenda -> this.getRecargo(prenda.getPrecio())).sum();
  }

  private Double getRecargo(Double precioPrenda) {
    return precioPrenda + (precioPrenda * cuotas * coeficiente * 0.01);
  }
}
