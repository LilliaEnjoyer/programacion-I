/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class Jugador {
    private String nombre;
    private ArrayList<Personaje> personajes;

    public Jugador(String nombre, ArrayList<Personaje> personajes) {
        this.nombre = nombre;
        this.personajes = personajes;
    }
    
    public void agregarPersonaje(Personaje personaje){
        personajes.add(personaje);
    }
    
    public void eliminarPersonaje(int personajeEliminar){
        personajes.remove(personajeEliminar);
    }
}
