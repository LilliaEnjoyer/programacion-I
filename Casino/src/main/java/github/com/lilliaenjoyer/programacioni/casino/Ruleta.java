/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.casino;

import java.util.Random;

/**
 * Juego de Ruleta.
 */
public class Ruleta extends Juego {
    private Random random = new Random();
    private String tipoApuesta;
    private int numApuesta;
    private boolean gana = false;

    public Ruleta(String tipoApuesta, double apuesta) {
        super(apuesta);
        this.tipoApuesta = tipoApuesta;
    }

    // CORRECCIÓN AQUÍ: Cambiado 'int apuesta' por 'double apuesta'
    public Ruleta(String tipoApuesta, double apuesta, int numApuesta) {
        super(apuesta);
        this.tipoApuesta = tipoApuesta;
        this.numApuesta = numApuesta;
    }

    @Override
    public double ganancia() {
        switch (tipoApuesta) {
            case "par":
            case "impar":
                return apuesta + (apuesta * 0.5);
            default:
                return apuesta + (apuesta * 10);
        }
    }

    @Override
    public String jugar(Jugador jugador) {
        if (errorApuesta(jugador) != null) {
            return errorApuesta(jugador);
        }

        gana = false;
        int numero = random.nextInt(37);
        double premio = 0;

        switch (tipoApuesta) {
            case "par":
                if (numero != 0 && numero % 2 == 0) {
                    gana = true;
                    premio = ganancia();
                }
                break;

            case "impar":
                if (numero % 2 != 0) {
                    gana = true;
                    premio = ganancia();
                }
                break;

            default:
                if (numero == numApuesta) {
                    gana = true;
                    premio = ganancia();
                }
                break;
        }

        repartirPremio(jugador, premio);
        return "RULETA | Salió: " + numero + "\n" + (gana ? "¡Ganaste! Premio: $" + premio : "Perdiste la apuesta.");
    }
}
