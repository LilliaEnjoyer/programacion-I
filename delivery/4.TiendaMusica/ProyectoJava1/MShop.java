import java.util.ArrayList;
import java.util.List;

public class MShop {

    public static void main(String[] args) {

        // --- 1. ADMINISTRADOR CREA PRODUCTOS ---
        System.out.println("=== 1. REGISTRO DE INVENTARIO (ADMIN) ===");
        Producto p1 = new Producto("P01", "Guitarra Eléctrica Fender", 1200.0, 5);
        Producto p2 = new Producto("P02", "Teclado Yamaha", 800.0, 3);
        Producto p3 = new Producto("P03", "Baquetas Zildjian", 25.0, 20);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // --- 2. CLIENTE REALIZA COMPRA ---
        System.out.println("\n=== 2. NUEVA VENTA DE CLIENTE ===");
        Cliente c1 = new Cliente("Carlos Pérez", "C101");

        Venta venta1 = new Venta("V001", c1);
        venta1.agregarProducto(p1, 1); // 1 Guitarra
        venta1.agregarProducto(p3, 2); // 2 Baquetas

        // Mostrar factura
        venta1.mostrarFactura();

        // Verificar cómo quedó el stock del inventario
        System.out.println("\n=== 3. STOCK ACTUALIZADO ===");
        System.out.println(p1);
        System.out.println(p3);

        // --- 4. SIMULACIÓN DE ELIMINACIÓN DE VENTA ---
        System.out.println("\n=== 4. ELIMINACIÓN DE LA VENTA ===");
        venta1 = null; 
        System.out.println("-> La Venta V001 ha sido eliminada.");

        // Verificamos que el cliente y productos siguen existiendo intactos
        System.out.println("Cliente sigue existiendo: " + c1);
        System.out.println("Producto p1 sigue existiendo: " + p1);
    }
}