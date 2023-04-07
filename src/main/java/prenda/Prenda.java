package prenda;

import prenda.descuentoestado.DescuentoEstado;

/**
 * Clase que representa una prenda.
 */
public class Prenda {
  private final Double precioBase;
  private final TipoPrendaEnum tipo;
  private final DescuentoEstado estado;

  /**
   * Constructor completo.
   *
   * @param precioBase el precio base de la prenda.
   * @param tipo       el tipo de la prenda.
   * @param estado     el estado/descuento de la prenda.
   */
  public Prenda(Double precioBase, TipoPrendaEnum tipo, DescuentoEstado estado) {
    this.precioBase = precioBase;
    this.tipo = tipo;
    this.estado = estado;
  }

  public Double getPrecio() {
    return precioBase - precioBase * estado.getDescuento();
  }

  public TipoPrendaEnum getTipo() {
    return tipo;
  }

}
