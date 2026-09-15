/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.githublilliaenjoyer.transporte;

/**
 *
 * @author salas
 */
public abstract class Vehiculo {
    private String modelo;
    protected String marca;
    private String placa;
    protected double valorComercial;

    public Vehiculo(String modelo, String marca, String placa, double valorComercial) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.valorComercial = valorComercial;
    }
    
    
    public abstract double CalcularCoste();
}
