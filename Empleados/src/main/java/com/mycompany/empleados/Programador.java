/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author SANTIAGO CARDOZO
 */
class Programador extends Empleados {    
    public Programador(int sueldo, int codigo, String nombre) {
        super(sueldo, codigo, nombre);
    }
    

    @Override
    public void Calculo() {
    }
    public void Mostrar_P(){
        System.out.println("El sueldo del programador es: " + sueldo);
    }
}
