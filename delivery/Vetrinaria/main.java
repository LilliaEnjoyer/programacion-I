public class Main {
    public static void main(String[] args) {
        // 1. Crear cliente y veterinario
        Cliente cliente = new Cliente("Carlos Gómez", 10123456,320234567);
        Veterinario veterinario = new Veterinario("Dra. Andrea Pérez", 1222456,311234567);

        // 2. Registrar mascota
        Mascota miMascota = new Mascota("Lucas", "Perro", 4, 12.5);
        cliente.registrarMascota(miMascota);

        // 3. Cliente consulta su mascota
        cliente.consultarMascotas();

        // 4. Veterinario actualiza peso (Intento con valor inválido y válido)
        System.out.println("\n--- Actualización de Peso ---");
        veterinario.actualizarDatosMedicos(miMascota, -3.0); // Debe fallar
        veterinario.actualizarDatosMedicos(miMascota, 13.2); // Debe actualizar

        // 5. Registrar una consulta médica
        System.out.println("\n--- Registro de Consulta ---");
        Consulta consulta1 = veterinario.registrarConsulta(
            miMascota, 
            "07/09/2026", 
            "Fiebre y letargo", 
            "Infección leve", 
            "Antibiótico cada 12h por 5 días"
        );

        consulta1.mostrarDetalles();

        // 6. Eliminar la consulta sin borrar Cliente ni Mascota
        System.out.println("\n--- Eliminación de Consulta ---");
        miMascota.eliminarConsulta(consulta1);
        consulta1 = null; // Liberación para el Garbage Collector

        // Verificación: Mascota y Cliente siguen existiendo
        System.out.println("Consulta eliminada. Verificando persistencia de datos:");
        cliente.consultarMascotas();
        System.out.println("Total de consultas de " + miMascota.getNombre() + ": " + miMascota.getConsultas().size());
    }
}