/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.githublilliaenjoyer.fundamentos;

/**
 *
 * @author salas
 */
public class Fundamentos {

    public static void main(String[] args) {
        estudiante est1 = new estudiante("andres",15);
       
        //est1.nombre= "pepe";
        //esto da error porque esa variable es privada, es decir, esta conigurada para limitar su acceso y solo es modificable 
        //dentro de la misma clase en la que fue creada
        
        est1.edad= 17;
        //cambia edad de 15 a 17
        est1.setNombre("marcos");
        
        docente doc1= new docente("juan","matematicas",40);
        
        doc1.nombre="juanito";
        doc1.especialidad="calculo";
        doc1.edad=45;
    }
}
