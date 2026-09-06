public class Hotel {
    public String nombre;
    public Habitacion[] habitaciones;
    public Huesped[] huespedes;
    public Reserva[] reservas;
    public int contadorHabitaciones = 0;
    public int contadorHuespedes = 0;
    public int contadorReservas = 0;

    public Hotel(String nombre) {
        this.nombre = nombre;
        
        this.habitaciones = new Habitacion[10];
        this.huespedes = new Huesped[10];
        this.reservas = new Reserva[10];
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones[contadorHabitaciones] = h;
        contadorHabitaciones++;
    }

    public void registrarHuesped(Huesped h) {
        huespedes[contadorHuespedes] = h;
        contadorHuespedes++;
    }

    
    public void mostrarHabitacionesDisponibles() {
        System.out.println("--- HABITACIONES DISPONIBLES ---");
        for (int i = 0; i < contadorHabitaciones; i++) {
            if (habitaciones[i].estado.equals("disponible")) {
                System.out.println("Numero: " + habitaciones[i].numero + " | Tipo: " + habitaciones[i].tipo);
            }
        }
    }

    public void realizarReserva(Huesped huesped, Habitacion habitacion, String entrada, String salida) {
        
        if (!habitacion.estado.equals("disponible")) {
            System.out.println("Lo sentimos, la habitacion " + habitacion.numero + " NO esta disponible.");
            return; 
        }

        
        int nuevoId = contadorReservas + 1;
        Reserva nuevaReserva = new Reserva(nuevoId, huesped, habitacion, entrada, salida);
        
        reservas[contadorReservas] = nuevaReserva;
        contadorReservas++;

        
        habitacion.cambiarEstado("ocupada", "administrador");
        System.out.println("Reserva exitosa " + nuevoId + " para " + huesped.nombre + "");
    }

    public void eliminarReserva(int idBuscar) {
        for (int i = 0; i < contadorReservas; i++) {
            if (reservas[i].idReserva == idBuscar) {
                
                reservas[i].habitacion.cambiarEstado("disponible", "administrador");

                for (int j = i; j < contadorReservas - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                reservas[contadorReservas - 1] = null;
                contadorReservas--;
                
                System.out.println("Reserva " + idBuscar + " eliminada, El huesped y la habitacion siguen en el sistema.");
                return;
            }
        }
        System.out.println("No se encontro la reserva con ID: " + idBuscar);
    }
}
