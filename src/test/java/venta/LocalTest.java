package venta;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.estado.EstadoNueva;
import venta.mediopago.PagoEfectivo;

/**
 * Clase para testear la clase Local.
 */
public class LocalTest {

  private Local local;

  @BeforeEach
  public void setUp() {
    Prenda unaPrenda = new Prenda(TipoPrendaEnum.PANTALON, 100.0, new EstadoNueva());
    Item unItem = new Item(unaPrenda, 1);

    Venta unaVenta = new Venta(new PagoEfectivo(), LocalDate.of(2023, 6, 4));
    Venta otraVenta = new Venta(new PagoEfectivo(), LocalDate.now());

    unaVenta.agregarItem(unItem);
    otraVenta.agregarItem(unItem);

    local = new Local();
    local.agregarVenta(unaVenta);
    local.agregarVenta(otraVenta);
  }

  @Test
  public void testCalcularGananciasPorFecha() {
    assertEquals(100.0, local.calcularGananciasPorFecha(LocalDate.now()));
  }
}
