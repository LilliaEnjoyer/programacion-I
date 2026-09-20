/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package github.com.lilliaenjoyer.programacioni.videojuego2;

/**
 *
 * @author samue
 */
public class Videojuego2 {

    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero(20, 1, "Guerrero 1", 1, 100, 0);
        Guerrero guerrero2 = new Guerrero(25, 2, "Guerrero 2", 1, 120, 0);

        Mago mago1 = new Mago(25, 100, 3, "Mago 1", 1, 80, 0);
        Mago mago2 = new Mago(30, 120, 4, "Mago 2", 1, 90, 0);

        Arquero arquero1 = new Arquero(15, 10, 5, "Arquero 1", 1, 90, 0);
        Arquero arquero2 = new Arquero(18, 12, 6, "Arquero 2", 1, 95, 0);
        Arquero arquero3 = new Arquero(20, 15, 7, "Arquero 3", 1, 90, 0);
        
        Combate pvp1 = new Combate(mago1,guerrero1);
        pvp1.iniciarCombate();
        Combate pvp2 = new Combate(mago1,guerrero2);
        pvp2.iniciarCombate();
        Combate pvp3 = new Combate(arquero1,mago2);
        pvp3.iniciarCombate();
        Combate pvp4 = new Combate(arquero3,arquero2);
        pvp4.iniciarCombate();

        
    }
}
