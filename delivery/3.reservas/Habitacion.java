public class Habitacion {
    public int numero;
    public String tipo;
    public String estado;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "disponible";

    public void cambiarEstado(String nuevoEstado, String rolUsuario) {
        if (rolUsuario.equals("administrador")) {
            this.estado = nuevoEstado;
        } else {
            System.out.println("ERROR: Solo el administrador puede cambiar el estado.");
        }
    }
}
