package venta;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.estado.EstadoNueva;
import venta.mediopago.PagoEfectivo;
import venta.mediopago.PagoTarjeta;

/**
 * Clase para testear la clase Venta.
 */
public class VentaTest {

  private Venta ventaEfectivo;
  private Venta ventaTarjeta;

  @BeforeEach
  public void setUp() {
    Prenda unaPrenda = new Prenda(TipoPrendaEnum.PANTALON, 100.0, new EstadoNueva());
    Item unItem = new Item(unaPrenda, 1);

    ventaEfectivo = new Venta(new PagoEfectivo(), LocalDate.of(2023, 6, 4));
    ventaTarjeta = new Venta(new PagoTarjeta(3, 1.0), LocalDate.now());

    ventaEfectivo.agregarItem(unItem);
    ventaTarjeta.agregarItem(unItem);
  }

  @Test
  public void testCalcularPrecioFinalVentaEfectivo() {
    assertEquals(100.0, ventaEfectivo.calcularPrecioFinal());
  }

  @Test
  public void testCalcularPrecioFinalVentaTarjeta() {
    assertEquals(103.0, ventaTarjeta.calcularPrecioFinal());
  }

  @Test
  public void testEsDeFechaWithSameDayFecha() {
    assertTrue(ventaTarjeta.esDeFecha(LocalDate.now()));
  }

  @Test
  public void testEsDeFechaWithDifferentDayFecha() {
    assertFalse(ventaEfectivo.esDeFecha(LocalDate.now()));
  }
}
