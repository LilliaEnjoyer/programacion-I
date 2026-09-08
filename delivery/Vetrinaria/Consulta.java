public class Consulta {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private Mascota mascota;

    // Constructor
    public Consulta(String fecha, String motivo, String diagnostico, String tratamiento, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.mascota = mascota;
    }

    public void mostrarDetalles() {
        System.out.println("Fecha: " + fecha + " | Mascota: " + mascota.getNombre() +
                           " | Motivo: " + motivo + " | Diagnóstico: " + diagnostico +
                           " | Tratamiento: " + tratamiento);
    }

    // Getters y Setters
    public String getFecha() { return fecha; }
    public String getMotivo() { return motivo; }
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }
    public Mascota getMascota() { return mascota; }
}