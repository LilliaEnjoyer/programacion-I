public class Mago extends Personaje {

    private int poderMagico;
    private int mana;

    public Mago(int id, String nombre, int nivel, int puntosVida, int puntosVidaMax, int experiencia, int xpRequerida, int poderMagico, int mana) {
        super(id, nombre, nivel, puntosVida, puntosVidaMax, experiencia, xpRequerida);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    @Override
    public int calcularDano() {
        return this.poderMagico * getNivel();
    }

    public int ataqueEspecial() {
        if (this.mana >= 20) {
            this.mana -= 20;
            int danoEspecial = this.poderMagico * 2 * getNivel();
            System.out.println(getNombre() + " ha realizado un ataque especial causando " + danoEspecial + " de daño. Mana restante: " + this.mana);
            return danoEspecial;
        } else {
            System.out.println(getNombre() + " no tiene suficiente mana para realizar un ataque especial.");
            return calcularDano();
        }
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}