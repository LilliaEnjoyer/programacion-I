/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.githublilliaenjoyer.transporte;

import java.util.ArrayList;

/**
 *
 * @author salas
 */
public class Transporte {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehichulos = new ArrayList<>();
        
        VehiculoParticular vehp1 = new VehiculoParticular("Model s","Tesla","pyz619",450000000);
        VehiculoParticular vehp2 = new VehiculoParticular("Nissan versa","Nissan","gpr468",75000000);
        VehiculoTransporte veht1 = new VehiculoTransporte("Volvo B12M","Volvo","mwu348", 140000000);
        VehiculoTransporte veht2 = new VehiculoTransporte("Mercedes-Benz 0500MA","Mercedes","mwu348", 400000000);
        
        vehichulos.add(vehp1);
        vehichulos.add(veht1);
        vehichulos.add(vehp2);
        vehichulos.add(veht2);

        for(Vehiculo vehichulo: vehichulos){
            System.out.printf("%.0f%n", vehichulo.CalcularCoste());
        }

        
    }
}
