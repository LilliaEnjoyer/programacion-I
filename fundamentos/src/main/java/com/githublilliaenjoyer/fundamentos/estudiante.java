/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.githublilliaenjoyer.fundamentos;

/**
 *
 * @author salas
 */
public class estudiante {
   private String nombre;
   int edad;
   
   //constructor
   public estudiante (String nombre,int edad){
       this.nombre = nombre;
       this.edad = edad;
   }   
   
   //metodo para modificar la variable privada nombre
   public String setNombre(String nombre){
       if(nombre.length() > 10){
           return "el nombre no debe contener mas de 10 caracteres";
       }
       this.nombre = nombre;
       return "nombre actualizado";
   }
   
}
