/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego2;

/**
 *
 * @author samue
 */
public class Guerrero extends Personajes{
    private int fuerza;

    public Guerrero(int fuerza, int id, String nombre, int nivel, int pv, int exp) {
        super(id, nombre, nivel, pv, exp);
        this.fuerza = fuerza;
    }

    @Override
    public double calculoDmg() {
        if(pv <= pvmax*.30){
            return (fuerza*nivel)+(fuerza*nivel)*.20;
        }else {
            return fuerza*nivel;
        }
    }

    public void atacar(Personajes enemigo) {
        System.out.println(nombre + " ataca con su espada y hace " + calculoDmg() + " de daño");
        enemigo.perderVida(calculoDmg());
    }
        
    
}
