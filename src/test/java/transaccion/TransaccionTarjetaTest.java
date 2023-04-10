package transaccion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.descuentoestado.DescuentoPrendaNueva;
import java.time.LocalDate;

public class TransaccionTarjetaTest {

  private TransaccionTarjeta transaccionTarjeta;

  @BeforeEach
  public void setUp() {
    transaccionTarjeta = new TransaccionTarjeta(LocalDate.now(), (short) 2, 25.0);
    Prenda unaPrenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    Prenda otraPrenda = new Prenda(5.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    transaccionTarjeta.addPrenda(unaPrenda);
    transaccionTarjeta.addPrenda(otraPrenda);
  }

  @Test
  public void testTransaccionTarjetaOcurredToday() {
    assertTrue(transaccionTarjeta.isToday());
  }

  @Test
  public void testTransaccionTarjetaMonto() {
    assertEquals(22.5, transaccionTarjeta.getMonto());
  }
}
