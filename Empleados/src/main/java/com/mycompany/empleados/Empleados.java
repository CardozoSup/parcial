/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public abstract class Empleados {
    protected int codigo;
    protected String nombre;
    protected int sueldo;
    public Empleados(int sueldo, int codigo, String nombre){
     this.sueldo = sueldo;
     this.codigo = codigo;
     this.nombre = nombre;
    }
    public abstract void Calculo();
    public void MostrarDatos(){
        System.out.println("El codigo del empleados es: " + codigo);
        System.out.println("El Empleado " + nombre);
        System.out.println("Con un sueldo de: " +sueldo);
    }
}
