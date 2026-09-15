/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.githublilliaenjoyer.transporte;

/**
 *
 * @author salas
 */
public class VehiculoTransporte extends Vehiculo{

    public VehiculoTransporte(String modelo, String marca, String placa, double valorComercial) {
        super(modelo, marca, placa, valorComercial);
    }

    @Override
    public double CalcularCoste() {
        if(marca == "Mercedes"){
            return valorComercial+1000000;
        }else{
            return valorComercial;
        }
    }
    
}
