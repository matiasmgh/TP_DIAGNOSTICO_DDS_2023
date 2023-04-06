package transaccion;

import java.time.LocalDate;
import prenda.Prenda;

public class TransaccionEfectivo extends Transaccion {

  public TransaccionEfectivo(LocalDate fecha) {
    super(fecha);
  }

  @Override
  public Double getMonto() {
    return this.prendas.stream().mapToDouble(Prenda::getPrecio).sum();
  }
}
