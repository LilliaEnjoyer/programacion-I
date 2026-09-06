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
public class Inventario {
    private ArrayList<String> objetos;

    public Inventario(ArrayList<String> objetos) {
        this.objetos = objetos;
    }
    
    public void perderObjeto(int objetoPerdido){
        objetos.remove(objetoPerdido);
    }
    
    public void annadirObjeto(String objetoAnnadido){
        objetos.add(objetoAnnadido);
    }
    
    public void consultarObjetos(){
        System.out.println(objetos);
    }
    
    public void muertePersonaje(){
        objetos.clear();
    }
    
}
