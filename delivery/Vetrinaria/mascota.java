import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private List<Consulta> consultas;

    // Constructor
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.consultas = new ArrayList<>();
        setPeso(peso); // Validación inicial
    }

    // Método para actualizar el peso con restricción > 0
    public boolean actualizarPeso(double nuevoPeso) {
        if (nuevoPeso > 0) {
            this.peso = nuevoPeso;
            return true;
        }
        System.out.println("Error: El peso debe ser mayor que 0.");// peso <= 0. No permite actualizar
        return false;
    }

    public void agregarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }
// Elimina consulta sin eliminar cliente ni Mascota
    public void eliminarConsulta(Consulta consulta) {
        this.consultas.remove(consulta);
    }

  
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public List<Consulta> getConsultas() { return consultas; }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 1.0; // Valor por defecto en caso de error inicial
            System.out.println("Peso inválido. Se asignó 1.0 kg por defecto.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie +  " | Edad: " + edad + " años | Peso: " + peso + " kg");
    }
}