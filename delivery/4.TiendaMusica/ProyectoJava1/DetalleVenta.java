class DetalleVenta {

    private Producto producto;
    private int cantidad;
    private double precioPagado;

    public DetalleVenta(Producto producto, int cantidad, double precioPagado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPagado = precioPagado;
    }

    public double getSubTotal() {
        return cantidad * precioPagado;
    }

    public void mostrarDetalle() {
        System.out.println(" - " + producto.getNombre() + " x" + cantidad + " @ $" + precioPagado + " c/u = $" + getSubTotal());
    }
}
