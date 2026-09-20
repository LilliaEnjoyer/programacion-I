/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego2;

import java.util.Random;

/**
 *
 * @author samue
 */
public class Arquero extends Personajes{
    private int fuerza;
    private int precision;
    Random random = new Random();

    public Arquero(int fuerza, int precision, int id, String nombre, int nivel, int pv, int exp) {
        super(id, nombre, nivel, pv, exp);
        this.fuerza = fuerza;
        this.precision = precision;
    }

    @Override
    public double calculoDmg() {
        int numero = random.nextInt(5);
        if(numero == 1){
            return ((fuerza*nivel)+precision)*2;
        }else {
            return (fuerza*nivel)+precision;        
        }
    }

    public void atacar(Personajes enemigo) {
        double dmg = calculoDmg();
        System.out.println(nombre + " ataca con su arco y hace " + dmg + " de daño a su enemigo");
        enemigo.perderVida(dmg);
    }
    
    
}
