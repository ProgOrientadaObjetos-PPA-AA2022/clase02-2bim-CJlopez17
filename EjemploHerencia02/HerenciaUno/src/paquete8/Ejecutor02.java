
package paquete8;


public class Ejecutor02 {
    public static void main(String[] args) {
        String nombre = "RENE";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        
        EstudinatePrecencial esPresencial = new EstudinatePrecencial(nombre,apellido,
        identificacion,edad,numAsignaturas,costoAsig);
        
        esPresencial.calcularMatriculaPresencial();
        
        System.out.println(esPresencial);
    }
        
        
        
}
