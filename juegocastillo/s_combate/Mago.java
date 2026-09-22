public class Mago extends Personajes {
    private int poderMagico;
    private int mana;
    public Mago(int id,String Nusuario,int nivel,int vidaMx,int poderMagico,int mana){
        super(id, Nusuario, nivel, vidaMx, vidaMx, 0, 200);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }
    @Override 
    public int calculoDaño(){
        if(this.mana >= 20){
            this.mana = this.mana-20;
            System.out.println("ataque especial magico(mana restante:"+this.mana);
            return this.poderMagico*getnivel()*2;
        }else{
            System.out.println("El mana no es suficiente para realizar un ataque especial magico");
            return this.poderMagico*getnivel();
        }
    }
    @Override 
    public void atacar(Personajes objetivo){
        int dañoCausado= calculoDaño();
        System.out.println(getNusuario()+"lanzo un conjuro dirijido a: "+objetivo.getNusuario());
        objetivo.dañoRecibido(dañoCausado);
    }
    public int getPoderMagico() { 
        return poderMagico; }
    public void setPoderMagico(int poderMagico) { 
        this.poderMagico = poderMagico; }
    public int getMana() {
        return mana; }
    public void setMana(int mana) { this.mana = mana; }
    
}
