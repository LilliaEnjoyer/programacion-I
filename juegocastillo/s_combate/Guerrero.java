public class Guerrero extends Personajes {

    private int fuerza;


    public Guerrero(int id, String Nusuario, int nivel, int vidaMx, int fuerza) {
        
        super(id, Nusuario, nivel, vidaMx, vidaMx, 0, 200);
        this.fuerza = fuerza;
    }

    @Override
    public int calculoDaño() {
        int dañoBase = this.fuerza * getnivel();
        

        if (puntosVida() * 10 <= getvidaMx() * 3) {
            System.out.println("vida baja: +20% de daño.");
            return (int) (dañoBase * 1.2);
        }
        
        return dañoBase;
    }

    @Override
    public void atacar(Personajes objetivo) {
        int dañoCausado = calculoDaño();
        System.out.println(getNusuario() + " asestó un golpe físico a " + objetivo.getNusuario());
        objetivo.dañoRecibido(dañoCausado); 
    }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
}
