import java.util.ArrayList;
import java.util.List;


class Venta {

    private String idventa;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public Venta(String idventa, Cliente cliente) {
        this.idventa = idventa;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public String getIdVenta() {
        return idventa;
    }

    public boolean agregarProducto(Producto producto, int cantidad) {
        if (producto.reducirStock(cantidad)) {
            detalles.add(new DetalleVenta(producto, cantidad, producto.getPrecio()));
            return true;
        } else {
            System.out.println("No hay suficiente stock para el producto: " + producto.getNombre());
            return false;
        }
    }

    public double getTotal() {
        double total = 0;
        for (DetalleVenta d : detalles) {
            total += d.getSubTotal();
        }
        return total;
    }

        public void mostrarFactura() {
        System.out.println("Factura de Venta " + idventa + " ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");
        for (DetalleVenta d : detalles) {
            d.mostrarDetalle(); // Muestra el detalle limpio
        }
        System.out.println("Total pagado: $" + getTotal());
    }
} 