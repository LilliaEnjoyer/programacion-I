/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.videojuego;

/**
 *
 * @author samue
 */
public class Personaje {
    private String nombre;
    private Inventario inventario;
    private int vida;
    private int nivel;
    private boolean estado=true;//true es vivo, false es muerto

    public Personaje(String nombre, Inventario inventario,int vida,int nivel) {
        this.nombre = nombre;
        this.inventario = inventario;
        this.vida = vida;
        this.nivel = nivel;
    }
    
    //metodo consulta
    public void consulta(){
        System.out.println("nombre del personaje: "+nombre);
        System.out.println("vida actual del personaje: "+vida);
        System.out.println("nivel actual del personaje: "+nivel);
        inventario.consultarObjetos();
        if(estado){
            System.out.println("estado: vivo");
        }else{
            System.out.println("estado: muerto");
        }
    }
    
    public void personajeMuerto(){
        inventario.muertePersonaje();
    }
        
    public void quitarVida(int perderVida){
        if((vida-perderVida)<=0){
            estado=false;
            vida=0;
            personajeMuerto();
            //el personaje se elimina cuando muere
            System.out.println("el personaje ha muerto");
        }else{
            vida-=perderVida;
        }
    }
    
    public void sumarVida(int sumarVida){
        if((vida+sumarVida)>100){
            vida=100;
        }else{
            vida+=sumarVida;
        }
    }
    
    public void subirNivel(){
        nivel+=1;
    }
    
}
