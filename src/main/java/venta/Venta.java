package venta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import venta.mediopago.MedioPago;

/**
 * Clase que representa una venta al usuario.
 */
public class Venta {

  private final List<Item> items = new ArrayList<>();

  private final MedioPago medioPago;

  private final LocalDate fechaVenta;

  /**
   * Constructor.
   *
   * @param medioPago el medio de pago deseado.
   * @param fecha     la fecha en que se realiza la venta.
   */
  public Venta(MedioPago medioPago, LocalDate fecha) {
    this.medioPago = medioPago;
    this.fechaVenta = fecha;
  }

  /**
   * Calcula el precio final segun el medio de pago.
   *
   * @return el valor total y final.
   */
  public Double calcularPrecioFinal() {
    return medioPago.modificarPrecio(this.calcularSubTotal());
  }

  /**
   * Agrega un item a la venta.
   *
   * @param item el item a agregar.
   */
  public void agregarItem(Item item) {
    this.items.add(item);
  }

  /**
   * Comprueba si la fecha del a venta coincide con la pasada.
   *
   * @param fecha la fecha a comparar.
   * @return true si ambas fechas describen el mismo dia, false de lo contrario.
   */
  public Boolean esDeFecha(LocalDate fecha) {
    return this.fechaVenta.isEqual(fecha);
  }

  /**
   * Calcula el subtotal sumando los precios de los items.
   *
   * @return el subtotal sin recargo por medios de pago.
   */
  private Double calcularSubTotal() {
    return items.stream().mapToDouble(Item::calcularPrecioItem).sum();
  }

}
