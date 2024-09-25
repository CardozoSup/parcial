/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author SANTIAGO CARDOZO
 */
class Desarrollador extends Empleados{
    private int lineas;
    private double bono;
    private double total_D;
    public Desarrollador(int sueldo, int codigo, String nombre, int lineas) {
        super(sueldo, codigo, nombre);
        this.lineas = lineas;
    }

    @Override
    public void Calculo() {
       bono = sueldo * lineas;
       total_D = bono * 0.05;
    }
    public void Motrar_D(){
        System.out.println("El sueldo del empleado es: " + total_D);
    }

    public double getTotal_D() {
        return total_D;
    }
}
