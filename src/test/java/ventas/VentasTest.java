package ventas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prenda.Prenda;
import prenda.TipoPrendaEnum;
import prenda.descuentoestado.DescuentoPrendaNueva;
import transaccion.TransaccionEfectivo;
import transaccion.TransaccionTarjeta;
import venta.Ventas;
import java.time.LocalDate;

public class VentasTest {

  private Ventas ventas;

  @BeforeEach
  public void setUp() {
    ventas = new Ventas();

    TransaccionEfectivo transaccionEfectivo = new TransaccionEfectivo(LocalDate.now());
    Prenda unaPrenda = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    Prenda otraPrenda = new Prenda(5.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    transaccionEfectivo.addPrenda(unaPrenda);
    transaccionEfectivo.addPrenda(otraPrenda);

    TransaccionTarjeta transaccionTarjeta = new TransaccionTarjeta(LocalDate.now(), (short) 2, 25.0);
    Prenda unaPrendaTarjeta = new Prenda(10.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    Prenda otraPrendaTarjeta = new Prenda(5.0, TipoPrendaEnum.CAMISA, new DescuentoPrendaNueva());
    transaccionTarjeta.addPrenda(unaPrendaTarjeta);
    transaccionTarjeta.addPrenda(otraPrendaTarjeta);

    ventas.addVenta(transaccionEfectivo);
    ventas.addVenta(transaccionTarjeta);
  }

  @Test
  public void testCalculateGananciasDiarias() {
    assertEquals(37.5, ventas.calculateGananciasDiarias());
  }
}
