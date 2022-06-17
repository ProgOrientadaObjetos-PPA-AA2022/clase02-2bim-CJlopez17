
package paquete8;


public class EstudinatePrecencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    public EstudinatePrecencial(String n,String ap, String iden, int e,
        int numCred, double costCred){
            super(iden,e);
            establecerNombresEstudiante(n);
            establecerApellidoEstudiante(ap);
            numeroCreditos = numCred;
            costoCredito = costCred;
    }
    public EstudinatePrecencial( String ap, String iden, int e){
        super(iden, e);
    } 
    @Override
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom.toLowerCase(); // Juan.toUpperCase() >> JUAN 
    }
    @Override
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape.toLowerCase();
    }
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }
    
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    public double obtenerCostoCredito(){
        return costoCredito;
    }

    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo creditos: %d\n"
                + "Número de creditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante, 
                identificacionEstudiante,
                edadEstudiante,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }
}
