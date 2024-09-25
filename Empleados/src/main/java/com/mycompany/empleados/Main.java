/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empleado = null;
        System.out.println("Bienvenido a la empresa");
        System.out.println("Ingrese el numero correspondiente para calcular el sueldo del empleado");
        System.out.println("1. Programador");
        System.out.println("2. Analista");
        System.out.println("3. Desarollador");
        int Emplead = sc.nextInt();
        switch (empleado){
            case "1" ->{
                System.out.println("Ingrese cuantos programadores seran");
                int cant = sc.nextInt();
                int []empl = new int [cant];
                for(int i = 0; i < cant; i++){
                    System.out.println("Ingrese el sueldo del programador " + (i + 1));
                    int sueldo = sc.nextInt();
                    System.out.println("Ingrese el codigo del programador");
                    int codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre del programador");
                    String nombre = sc.next();
                    Programador prog = new Programador(sueldo, codigo, nombre);
                }
                break;
            }
            case "2" ->{
                System.out.println("Ingrese cuantos analistas seran");
                int cant = sc.nextInt();
                int []empl = new int [cant];
                 for(int i = 0; i < cant; i++){
                      System.out.println("Ingrese el sueldo del analista " + (i + 1));
                    int sueldo = sc.nextInt();
                     System.out.println("ingrese la candidad de Proyectos realizados");
                     int proyect = sc.nextInt();
                    System.out.println("Ingrese el codigo del analista");
                    int codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre del analista");
                    String nombre = sc.next();
                    Analista anali = new Analista(sueldo, codigo, nombre, proyect);
                    anali.Calculo();
                     System.out.println("El sueldo total es de: " + anali.getTotal_A());
                 }
                break;
            }
            case "3" ->{
                System.out.println("Ingrese cuantos desarrolladores seran");
                int cant = sc.nextInt();
                int []empl = new int [cant];
                 for(int i = 0; i < cant; i++){
                      System.out.println("Ingrese el sueldo del desarrollador " + (i + 1));
                    int sueldo = sc.nextInt();
                     System.out.println("ingrese la candidad de lineas realizadas");
                     int lineas = sc.nextInt();
                    System.out.println("Ingrese el codigo del desarrollador");
                    int codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre del desarrollador");
                    String nombre = sc.next();
                    Desarrollador desa = new Desarrollador(sueldo, codigo, nombre, lineas);
                    desa.Calculo();
                     System.out.println("El sueldo total es de " + desa.getTotal_D());
                 }
                break;
            }
        }
    }
}
