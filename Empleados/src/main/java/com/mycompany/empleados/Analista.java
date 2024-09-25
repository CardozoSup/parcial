/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author SANTIAGO CARDOZO
 */
class Analista extends Empleados{    
    private int proyectos;
    private double descuento;
    private double total_A;
    public Analista(int sueldo, int codigo, String nombre, int proyectos) {
        super(sueldo, codigo, nombre);
        this.proyectos = proyectos;
    }
    
    @Override
    public void Calculo(){
        descuento = proyectos * sueldo;
        total_A = descuento * 0.04;
    }
    public void Mostrar_A(){
        System.out.println("El total del salario para el analista es:" + total_A);
    }
    public double getTotal_A() {
        return total_A;
    }
}
