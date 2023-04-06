package venta;

import java.util.ArrayList;
import java.util.List;
import transaccion.Transaccion;

public class Ventas {

  private final List<Transaccion> ventas = new ArrayList<>();

  public void addVenta(Transaccion venta) {
    this.ventas.add(venta);
  }

  public Double calculateGananciasDiarias() {
    return this.ventas.stream().filter(Transaccion::isToday)
        .mapToDouble(Transaccion::getMonto).sum();
  }
}
