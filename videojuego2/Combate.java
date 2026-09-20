/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego2;

/**
 *
 * @author samue
 */
public class Combate {
    private Personajes pj1;
    private Personajes pj2;

    public Combate(Personajes pj1, Personajes pj2) {
        this.pj1 = pj1;
        this.pj2 = pj2;
    }
    
    public void iniciarCombate(){
        System.out.println("Los personajes a combatir son: "+pj1.getNombre()+"("+pj1.getNivel()+") y "+pj2.getNombre()+"("+pj2.getNivel()+")");
        while(pj1.vivo && pj2.vivo){
            pj1.accion(pj2);
            System.out.println(pj2.getNombre()+" tiene "+pj2.pv+" puntos de vida restantes");
            if(pj2.vivo){
                pj2.accion(pj1);
                System.out.println(pj1.getNombre()+" tiene "+pj1.pv+" puntos de vida restantes");
            }
        }
        ganador();
    }
    
    public void ganador(){
        if(pj1.vivo){
            System.out.println("-------------------------------------------------");
            System.out.println("El ganador del combate fue "+ pj1.getNombre());
            pj1.ganarCombate();
        }else {
            System.out.println("-------------------------------------------------");
            System.out.println("El ganador del combate fue "+pj2.getNombre());
            pj2.ganarCombate();
        }
    }
}
