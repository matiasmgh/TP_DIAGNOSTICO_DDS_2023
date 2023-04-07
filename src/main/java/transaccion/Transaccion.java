package transaccion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import prenda.Prenda;

/**
 * Clase que representa una transaccion de cualquier tipo.
 */
public abstract class Transaccion {
  protected List<Prenda> prendas = new ArrayList<>();

  protected LocalDate fecha;

  public Transaccion(LocalDate fecha) {
    this.fecha = fecha;
  }

  public abstract Double getMonto();

  public void addPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public Boolean isToday() {
    return LocalDate.now().isEqual(this.fecha);
  }
}
