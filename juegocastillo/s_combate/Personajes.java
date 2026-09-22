public abstract class Personajes{
    private int id;
    private String Nusuario;
    private int nivel;
    private int vidaMx;
    private int puntosVida;
    private int exp;
    private int xpRequerida;

    public Personajes (int id, String Nusuario, int nivel,int vidaMx, int puntosVida, int exp,int xpRequerida){
        this.id = id;
        this.Nusuario = Nusuario;
        this.nivel = nivel;
        this.vidaMx = vidaMx;
        this.puntosVida = puntosVida;
        this.exp = 0;
        this.xpRequerida = 200;
    }

    public abstract void atacar(Personajes objetivo);
    public abstract int calculoDaño();
    public void dañoRecibido(int daño){
        this.puntosVida = this.puntosVida-daño;
        if (this.puntosVida<0){
            this.puntosVida=0;
        }
    }
    public  boolean conVida(){
        return this.puntosVida > 0;
    }
    public void ganarxp(int cantidadexp){
        this.exp += cantidadexp;
        System.out.println(this.Nusuario+"gano"+cantidadexp+"de XP!");

        while (this.exp >= this.xpRequerida) {
            this.exp -= this.xpRequerida;
            subirlv();
            
        }
    }
    public void subirlv(){
        this.nivel++;
        this.vidaMx+=20;
        this.puntosVida=vidaMx;
        this.xpRequerida+=100;
        System.out.println(this.Nusuario+"subio al nivel"+this.nivel);
    }

    public int getid(){
        return id;
    }
    public String getNusuario(){
        return Nusuario;
    }
    public void setNusuario(String Nusuario){
        this.Nusuario = Nusuario;
    }
    public int getnivel(){
        return nivel;
    }
    public void setnivel(int nivel){
        if(nivel>0){
            this.nivel = nivel;
        }
    }
    public int puntosVida(){
        return puntosVida;
    }
    public int getvidaMx(){
    return vidaMx;
    }

    public int getexp(){
        return exp;
    }

}

