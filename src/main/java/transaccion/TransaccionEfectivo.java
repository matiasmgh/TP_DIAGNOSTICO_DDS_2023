package transaccion;

import java.time.LocalDate;
import java.util.List;
import prenda.Prenda;

public class TransaccionEfectivo extends Transaccion {

  public TransaccionEfectivo(List<Prenda> prendas, LocalDate fecha) {
    super(prendas, fecha);
  }

  @Override
  public Double getMonto() {
    return this.prendas.stream().mapToDouble(Prenda::getPrecio).sum();
  }
}
