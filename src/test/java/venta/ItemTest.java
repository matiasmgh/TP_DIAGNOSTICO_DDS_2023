package venta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.estado.EstadoNueva;

/**
 * Clase para testear la clase Item.
 */
public class ItemTest {

  private Item item;

  @BeforeEach
  public void setUp() {
    Prenda prenda = new Prenda(TipoPrendaEnum.SACO, 100.0, new EstadoNueva());
    item = new Item(prenda, 3);
  }

  @Test
  public void testCalcularPrecioItem() {
    assertEquals(300.0, item.calcularPrecioItem());
  }
}
