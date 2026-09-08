public class Veterinario {
    private String nombre;
    private int telefono;
    private int cedula;

    // Constructor
    public Veterinario(String nombre, int cedula, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
		this.cedula = cedula;
    }


    // El veterinario puede actualizar los datos médicos (ej. peso o registrar consultas)
    public void actualizarDatosMedicos(Mascota mascota, double nuevoPeso) {
       // System.out.println("El Dr. " + nombre + " está actualizando los datos médicos de " + mascota.getNombre());
        mascota.actualizarPeso(nuevoPeso);
    }

    public Consulta registrarConsulta(Mascota mascota, String fecha, String motivo, String diagnostico, String tratamiento) {
        Consulta nuevaConsulta = new Consulta(fecha, motivo, diagnostico, tratamiento, mascota);
        mascota.agregarConsulta(nuevaConsulta);
        System.out.println("Consulta registrada con éxito por el Dr. " + nombre);
        return nuevaConsulta;
    }
// Métodos de extracción de data (Getters)
    public String getNombre() { return nombre; }
    public int getIdentificacion() { return cedula; }
	public int getTelefono() { return telefono; }
}