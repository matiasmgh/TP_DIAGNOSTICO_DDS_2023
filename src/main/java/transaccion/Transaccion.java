package transaccion;

import java.time.LocalDate;
import java.util.List;
import prenda.Prenda;

public abstract class Transaccion {
  protected List<Prenda> prendas;

  protected LocalDate fecha;

  public Transaccion(List<Prenda> prendas, LocalDate fecha) {
    this.prendas = prendas;
    this.fecha = fecha;
  }

  public abstract Double getMonto();


  public Boolean isToday() {
    return LocalDate.now().isEqual(this.fecha);
  }
}
