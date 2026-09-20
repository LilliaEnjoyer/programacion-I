/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego2;

/**
 *
 * @author samue
 */
public abstract class Personajes {
    private int id;
    protected String nombre;
    protected int nivel;
    protected int pv;
    private int exp;
    protected int pvmax;
    protected boolean vivo = true;

    public Personajes(int id, String nombre, int nivel, int pv, int exp) {
        this.pvmax = pv;
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.pv = pv;
        this.exp = exp;
    }

    public abstract double calculoDmg();
    
    
    public void perderVida(double ataque) {
        pv -= ataque;
        
        if(pv <= 0){
            pv=0;
            System.out.println("El personaje "+nombre+" ha muerto");
            vivo = false;
        }
    }
    
    public void atacar(Personajes enemigo){
        enemigo.perderVida(calculoDmg());
    };
    
    public void accion(Personajes enemigo){
        if(!vivo){
            System.out.println("el personaje ha muerto y no puede realizar acciones");
            return;
        }
       atacar(enemigo);
    }
    
    public void ganarCombate(){
        exp+=100;
        System.out.println(nombre+ " ha ganado 100 de experiencia! yay");
        subirNivel();
    }
    
    public void subirNivel(){
        if((nivel+1)*100 <= exp){
            nivel+=1;
            pvmax+=20;
            pv=pvmax;
            System.out.println(nombre+" ha subido a nivel "+nivel);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPv() {
        return pv;
    }
    
    
}
