package prenda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import prenda.estado.EstadoLiquidacion;
import prenda.estado.EstadoNueva;
import prenda.estado.EstadoPromocion;

/**
 * Clase para testear la clase Prenda.
 */
public class PrendaTest {

  private static Prenda prendaNueva;
  private static Prenda prendaLiquidacion;

  private static Prenda prendaPromocion;

  @BeforeAll
  public static void setUp() {
    prendaPromocion = new Prenda(TipoPrendaEnum.PANTALON, 100.0,
        new EstadoPromocion(20.0));
    prendaNueva = new Prenda(TipoPrendaEnum.SACO, 100.0, new EstadoNueva());
    prendaLiquidacion = new Prenda(TipoPrendaEnum.SACO, 100.0, new EstadoLiquidacion());
  }

  @Test
  public void testCalcularPrecioPrendaWithEstadoPromocion() {
    assertEquals(80.0, prendaPromocion.calcularPrecioPrenda());
  }

  @Test
  public void testCalcularPrecioPrendaWithEstadoNuevo() {
    assertEquals(100.0, prendaNueva.calcularPrecioPrenda());
  }

  @Test
  public void testCalcularPrecioPrendaWithEstadoLiquidacion() {
    assertEquals(50.0, prendaLiquidacion.calcularPrecioPrenda());
  }

  @Test
  public void testTipoPrenda() {
    assertEquals(TipoPrendaEnum.PANTALON, prendaPromocion.getTipoPrenda());
  }
}
