/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;
import java.util.Scanner;

// promedio y calificacion
public class Actividad2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] calificaciones = new double[5];
        double suma = 0;
        
        System.out.print ("Nombre del Estudiante: ");
        String nombre = entrada.nextLine(); 
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextDouble();
        }
        
        for (int i = 0; i < calificaciones.length; i++){
            suma += calificaciones[i];
        }
            
        double promedio = suma/ 5;
        System.out.print ("Promedio: " + promedio);
        System.out.println();
        if (promedio >= 91 && promedio <= 100){
            System.out.print ("Calificacion: A");
        }
                    else if (promedio >=81 && promedio <=90){
            System.out.print ("Calificacion: B");
        }
                    else if (promedio >=71 && promedio <=80){
            System.out.print ("Calificacion: C");
        }
                    else if (promedio >=61 && promedio <=70){
            System.out.print ("Calificacion: D");
        }
                    else if (promedio >=51 && promedio <=60){
            System.out.print ("Calificacion: E");
        }
            else {
            System.out.print ("Calificacion: F");
        }
        
        
        entrada.close();
    }
}

        