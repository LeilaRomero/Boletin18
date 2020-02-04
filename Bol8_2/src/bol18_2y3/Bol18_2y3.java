package bol18_2y3;

/**
 *
 * @author Leila
 */
public class Bol18_2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Carga un array de tipo int, cas notas no modulo de programacion, dos 30
        alumnos da clase de DAM.
            Vidualiza o numero de aprobados e o de suspensos.
            Calcula e visualiza a nota media da clase.
            Visualiza a nota mais alta.
        */
    
    
    Metodos obj=new Metodos();
        int[] notas=new int[6];
        String[] nombre=new String[6];

        notas=obj.crearArray(notas);
        nombre=obj.crearArray(nombre);
        obj.aproSus(notas);
        obj.notaOrdenada(notas, nombre);

     
    }   
}
