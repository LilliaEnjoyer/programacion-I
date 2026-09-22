public abstract class Personaje {

    private int id;
    private String nombre;
    private int nivel;
    private int puntosVida;
    private int puntosVidaMax;
    private int experiencia;
    private int xpRequerida;

    public Personaje(int id, String nombre, int nivel, int puntosVida, int puntosVidaMax, int experiencia, int xpRequerida) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.puntosVidaMax = puntosVidaMax;
        this.xpRequerida = xpRequerida;
        this.experiencia = experiencia;
    }

    public abstract int calcularDano();

    public void recibirDano(int dano) {
        this.puntosVida -= dano;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosVida > 0;
    }

    public void ganarExperiencia(int exp) {
        this.experiencia += exp;
        if (this.experiencia >= 100) {
            this.nivel++;
            this.experiencia -= 100;
            this.puntosVidaMax += 10;
            this.puntosVida = this.puntosVidaMax;
        }
    }

    private void subirNivel() {
        this.nivel++;
        this.puntosVidaMax += 20;
        this.puntosVida = this.puntosVidaMax;

        this.xpRequerida += 100;

        System.out.println("¡Felicidades! " + this.nombre + " ha subido al nivel " + this.nivel + ".");
        System.out.println("Puntos de vida máximos: " + this.puntosVidaMax);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPuntosVidaMax() {
        return puntosVidaMax;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getXpRequerida() {
        return xpRequerida;
    }
}