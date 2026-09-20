/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Mago extends Personajes{
    private int poderMagico;
    private int mana;

    public Mago(int poderMagico, int mana, int id, String nombre, int nivel, int pv, int exp) {
        super(id, nombre, nivel, pv, exp);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }



    @Override
    public double calculoDmg() {
        return poderMagico*nivel;
    }
    
    public double atqEspecial() {
        if(mana-20 < 0){
            System.out.println("Mana insuficiente");
            return 0;
        }else{
            mana-=20;
            return (poderMagico*nivel)*2;
        }    
    }

    public void atacar(Personajes enemigo) {
        System.out.println(nombre + " ataca con su bara y hace" + calculoDmg() + " de daño");
        enemigo.perderVida(calculoDmg());
    }
    
    public void ataqueEspecial(Personajes enemigo) {
        double dmg = atqEspecial();
        System.out.println(nombre + " crea una tormenta que golpea a su enemigo y hace " + dmg + " de daño");
        if(dmg==0){
            System.out.println(nombre + " crea una tormenta que golpea a su enemigo y hace " + dmg + " de daño (no tenia mana LOL)");       
        }
        enemigo.perderVida(dmg);
    }

    @Override
    public void accion(Personajes enemigo) {

        if (!vivo) {
            System.out.println("El personaje ha muerto y no puede realizar acciones");
            return;
        }
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Ataque normal");
        System.out.println("2. Ataque especial");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                atacar(enemigo);
                break;

            case 2:
                ataqueEspecial(enemigo);
                break;

            default:
                System.out.println("Opción incorrecta");
    }
}
    
}
