class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa");
        }
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Producto[codigo=%s, nombre=%s, precio=%.2f, cantidad=%d]", codigo, nombre, precio, cantidad);
    }
}