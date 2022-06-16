
package paquete4;


public class Ejecutor02 {
    public static void main(String[] args) {
    
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial esPrecencial = new EstudiantePresencial(nombre,apellido,
        identificacion,edad);
        
        esPrecencial.establecerNumeroCreditos(50);
        esPrecencial.establecerCostoCredito(50.2);
        esPrecencial.calcularMatriculaPresencial();;
        
        System.out.println(esPrecencial);
    }
}
