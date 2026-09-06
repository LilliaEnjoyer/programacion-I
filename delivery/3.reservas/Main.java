public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Principiante");
        
        Habitacion h101 = new Habitacion(101, "Simple");
        Habitacion h102 = new Habitacion(102, "Doble");
        hotel.agregarHabitacion(h101);
        hotel.agregarHabitacion(h102);

        Huesped cliente = new Huesped(1, "Pedro Perez", "pedro@mail.com");
        hotel.registrarHuesped(cliente);

        System.out.println("--- Intentando cambiar estado como huesped ---");
        h101.cambiarEstado("mantenimiento", "huesped"); 
        

        
        System.out.println();
        hotel.mostrarHabitacionesDisponibles();

        
        System.out.println("\n--- Reservando la habitacion 101 ---");
        hotel.realizarReserva(cliente, h101, "2026-10-01", "2026-10-05");

        
        System.out.println();
        hotel.mostrarHabitacionesDisponibles();

        System.out.println("\n--- Eliminando la reserva realizada ---");
        hotel.eliminarReserva(1);

        System.out.println("\n--- Conteo total en el sistema para comprobar persistencia ---");
        System.out.println("Habitaciones registradas: " + hotel.contadorHabitaciones);
        System.out.println("Huespedes registrados: " + hotel.contadorHuespedes);
        System.out.println("Reservas activas: " + hotel.contadorReservas);
    }
}
