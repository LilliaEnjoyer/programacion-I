/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package github.com.lilliaenjoyer.programacioni.videojuego;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class Videojuego {

    public static void main(String[] args) {
        
        //creo los objetos que iran en el inventario, el propio inventario y el jugador
        ArrayList<String> objetos = new ArrayList<>();
        Inventario inventario1 = new Inventario(objetos);
        Personaje personaje1 = new Personaje("Juan", inventario1 , 100, 1);
        
        //lista personajes y jugador
        ArrayList<Personaje> personajes = new ArrayList<>();
        Jugador jugador1 = new Jugador("Andres", personajes);
        jugador1.agregarPersonaje(personaje1);
        
        //objetos
        inventario1.annadirObjeto("espada");
        inventario1.annadirObjeto("pocion");
        inventario1.annadirObjeto("llave");
        
        //metodos del personaje
        personaje1.consulta();
        personaje1.quitarVida(50);
        personaje1.sumarVida(20);
        personaje1.subirNivel();
        personaje1.consulta();
        
        //muerte :c
        personaje1.quitarVida(100);
        personaje1.consulta();
        
        //gracias por leer
    }
}
