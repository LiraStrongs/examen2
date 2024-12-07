/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2;

import java.util.Scanner;

/**
 *
 * @author sebastianlira
 */
public class Examen2 {

    public static void main(String[] args) {
       
        
        Scanner captu;
        int  calificaciones;
        double calificacion1 , calificacion2, calificacion3, calificacion4, calificacion5;
        double promedio;
        double calificacion_mas_alta;
        double calificacion_mas_baja;
       
        int Numeroestudiantes;
        int estudiante1,estudiante2,estudiante3,estudiante4,estudiante5;
         captu = new Scanner(System.in);//creamos la herramienta

        
        System.out.println("ingrese la calificacion de estudiante 1");
        calificacion1 = captu.nextInt();
        System.out.println("ingrese la calificacion de estudiante 2");
        calificacion2 = captu.nextInt();
        System.out.println("ingrese la calificacion de estudiante 3");
        calificacion3 = captu.nextInt();
        System.out.println("ingrese la calificacion de estudiante 4");
        calificacion4 = captu.nextInt();
        System.out.println("ingrese la calificacion de estudiante 5");
        calificacion5 = captu.nextInt();
       
        
       promedio = (calificacion1 + calificacion2 +calificacion3+ calificacion4+ calificacion5) /5.000;
      
      
       
       System.out.println(" el promedio es"+promedio );
       
       
      
        
    }
    
    //public static calificacion_mas_alta(double);
    
    
    
}
