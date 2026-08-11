/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.githublilliaenjoyer.fundamentos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author salas
 */
public class docente {
   private String nombre;
   private String especialidad;
   private int edad;
   
   public docente(String nombre,String especialidad,int edad){
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.edad = edad;
   }
   
   public String setNombre(String nombre){
        if (nombre.matches("\\p{L}+")) {
            this.nombre = nombre;
            return "nombre cambiado con exito";
        } else {
            return "el nombre solo debe tener letras";
        }
   }
   public String setEspecialidad(String especialidad){
        if (especialidad.matches("\\p{L}+")) {
            this.especialidad = especialidad;
            return "especialidad cambiada con exito";
        } else {
            return "la especialidad solo debe tener letras";
        }
   }
}
