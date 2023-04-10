package transaccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.descuentoestado.DescuentoPrendaNueva;
import java.time.LocalDate;

public class TransaccionEfectivoTest {

  private TransaccionEfectivo transaccionEfectivo;
  private TransaccionEfectivo transaccionEfectivoToday;


  @BeforeEach
  public void setUp() {
    transaccionEfectivo = new TransaccionEfectivo(LocalDate.of(2023, 4, 6));
    Prenda unaPrenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    Prenda otraPrenda = new Prenda(5.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    transaccionEfectivo.addPrenda(unaPrenda);
    transaccionEfectivo.addPrenda(otraPrenda);
    transaccionEfectivoToday = new TransaccionEfectivo(LocalDate.now());
  }

  @Test
  public void testTransaccionDidNotOccurToday() {
    assertFalse(transaccionEfectivo.isToday());
  }

  @Test
  public void testTransaccionOccurredToday() {
    assertTrue(transaccionEfectivoToday.isToday());
  }

  @Test
  public void testGetMontoTwoPrendas() {
    assertEquals(15.0, transaccionEfectivo.getMonto());
  }
}
