    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.githublilliaenjoyer.transporte;

/**
 *
 * @author salas
 */
public class VehiculoParticular extends Vehiculo {

    public VehiculoParticular(String modelo, String marca, String placa, double valorComercial) {
        super(modelo, marca, placa, valorComercial);
    }

    @Override
    public double CalcularCoste() {
        if(valorComercial > 50000000){
            return valorComercial+(valorComercial*0.05);
        }else{
            return valorComercial;
        }
    }
    
}
