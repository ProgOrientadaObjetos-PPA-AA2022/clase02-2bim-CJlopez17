/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Ejercutor02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre,apellido,identificacion;
        int edad, numCred;
        double costocred; 
        
        System.out.println("Nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.println("Apellido del estudiante: ");
        apellido = sc.nextLine();
        System.out.println("Identificacion: ");
        identificacion = sc.nextLine();
        System.out.println("Edad del estudiante: ");
        edad = sc.nextInt();
        System.out.println("Numero de creditos: ");
        numCred = sc.nextInt();
        System.out.println("Costo de creditos: ");
        costocred = sc.nextDouble();
        
        EstudiantePresencial esPrececial = new EstudiantePresencial(nombre,apellido,
        identificacion,edad,numCred,costocred);
        
        esPrececial.calcularMatriculaPresencial();
        
        System.out.println(esPrececial);
    }
    
}
