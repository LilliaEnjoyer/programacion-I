import java.util.Random;

public class Arquero extends Personaje {

    private int fuerza;
    private int presicion;
    private Random random;

    public Arquero(int fuerza, int presicion, int id, String nombre, int nivel, int puntosVida, int puntosVidaMax, int experiencia, int xpRequerida) {
        super(id, nombre, nivel, puntosVida, puntosVidaMax, experiencia, xpRequerida);
        this.fuerza = fuerza;
        this.presicion = presicion;
        this.random = new Random();
    }

    @Override
    public int calcularDano() {
        int danoBase = (this.fuerza * this.presicion) + getNivel();

        boolean esCritico = random.nextDouble() < 0.3;
        if (esCritico) {
            System.out.println(getNombre() + " ha realizado un golpe crítico!");
            danoBase *= 2;
        }
        return danoBase;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }
}