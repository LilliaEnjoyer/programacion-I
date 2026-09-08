import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
    private int telefono;
    private int cedula;
    private List<Mascota> mascotas;

    // Constructor
    public Cliente(String nombre, int cedula, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
		this.cedula = cedula;
        this.mascotas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    // El cliente puede consultar la información de sus mascotas
    public void consultarMascotas() {
        System.out.println("\n--- Mascotas del Cliente: " + nombre + " ---");
        if (mascotas.isEmpty()) {
            System.out.println("No tiene mascotas registradas.");
            return;
        }
        for (Mascota m : mascotas) {
            m.mostrarInformacion();
        }
    }

    public String getNombre() { return nombre; }
    public int getIdentificacion() { return cedula; }
	public int getTelefono() { return telefono; }
    public List<Mascota> getMascotas() { return mascotas; }
}