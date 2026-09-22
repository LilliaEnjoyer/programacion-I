public class Arquero extends Personajes {

    private int fuerza;
    private int precision;

    public Arquero(int id, String Nusuario, int nivel, int vidaMx, int fuerza, int precision) {

        super(id, Nusuario, nivel, vidaMx, vidaMx, 0, 200);
        this.fuerza = fuerza;
        this.precision = precision;
    }

  
    @Override
    public int calculoDaño() {
        int dañoBase = (this.fuerza * getnivel()) + this.precision;

        if (System.nanoTime() % 2 == 0) {
            System.out.println("¡GOLPE CRÍTICO!");
            return dañoBase * 2;
        }
        
        return dañoBase;
    }

    @Override
    public void atacar(Personajes objetivo) {
        int dañoCausado = calculoDaño(); 
        System.out.println( getNusuario() + " disparo una flecha certera a " + objetivo.getNusuario());
        objetivo.dañoRecibido(dañoCausado); 
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
}
