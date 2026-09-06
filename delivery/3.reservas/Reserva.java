public class Reserva {
    public int idReserva;
    public Huesped huesped;
    public Habitacion habitacion;
    public String fechaEntrada;
    public String fechaSalida;

    public Reserva(int idReserva, Huesped huesped, Habitacion habitacion, String fechaEntrada, String fechaSalida) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
}
