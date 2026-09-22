public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(int fuerza, int id, String nombre, int nivel, int puntosVida, int puntosVidaMax, int experiencia, int xpRequerida) {
        super(id, nombre, nivel, puntosVida, puntosVidaMax, experiencia, xpRequerida);
        this.fuerza = fuerza;
    }

    @Override
    public int calcularDano() {
        int danoBase = this.fuerza * getNivel();

        if (getPuntosVida() <= (getPuntosVidaMax() * 0.3)) {
            System.out.println(getNombre() + " ha realizado un golpe especial");
            danoBase = (int) (danoBase * 1.2);
        }
        return danoBase;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}