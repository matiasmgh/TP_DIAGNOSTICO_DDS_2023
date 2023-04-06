package prenda.descuentoestado;

public class DescuentoPrendaPromocion implements DescuentoEstado {

  private final Double descuento;

  public DescuentoPrendaPromocion(Double descuento) {
    this.descuento = descuento;
  }

  @Override
  public Double getDescuento() {
    return descuento;
  }
}
