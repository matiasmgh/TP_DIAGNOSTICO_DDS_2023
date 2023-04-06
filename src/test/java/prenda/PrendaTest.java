package prenda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import prenda.descuentoestado.DescuentoPrendaLiquidacion;
import prenda.descuentoestado.DescuentoPrendaNueva;
import prenda.descuentoestado.DescuentoPrendaPromocion;

public class PrendaTest {

  private Prenda prenda;

  @Test
  public void getPrecioTestWithLiquidacion() {
    prenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaLiquidacion());

    assertEquals(5.0, prenda.getPrecio());
  }

  @Test
  public void getPrecioTestWithPromocion() {
    prenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaPromocion(0.20));

    assertEquals(8.0, prenda.getPrecio());
  }

  @Test
  public void getPrecioTestWithProductoNuevo() {
    prenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());

    assertEquals(10.0, prenda.getPrecio());
  }
}
