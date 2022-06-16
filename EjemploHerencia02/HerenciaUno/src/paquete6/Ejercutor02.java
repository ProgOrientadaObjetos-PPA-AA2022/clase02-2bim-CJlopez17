package paquete6;

import java.util.Scanner;

public class Ejercutor02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = " ", nombre, apellido, identificacion, continuar;
        int edad, numCred;
        double costocred;

        do {
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

            EstudiantePresencial esPrecencail = new EstudiantePresencial(nombre, apellido,
                    identificacion, edad, numCred, costocred);
            esPrecencail.calcularMatriculaPresencial();
            n = String.format("%s%S\n", n,esPrecencail);
            /*
            System.out.println(esPrecencail);
            */
            sc.nextLine();
            
            System.out.println("Desea ingresar más estudiantes. Digite la letra"
                    + " S \npara continuar o digite la letra N para salir");
            continuar = sc.nextLine();
        } while (continuar.equals("S"));
        System.out.println(n);
        /*EstudiantePresencial esPrecencail = new EstudiantePresencial(nombre, apellido,
                    identificacion, edad, numCred, costocred);
            esPrecencail.calcularMatriculaPresencial();
            System.out.println(esPrecencail);
        */
    }
}
