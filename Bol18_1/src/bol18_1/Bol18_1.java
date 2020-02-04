package bol18_1;

/**
 *
 * @author Leila
 */
public class Bol18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * Realiza un programa que cree un array chamado “numeros” con 6 numeros
         * aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o
         * revés (0 primeiro elemento visualizaráse o último e asi sucesivamente)
        */
        
        Metodos obj= new Metodos();
        int[] numeros= new int[6];
        numeros=obj.crearArray(numeros);
        obj.visualizarArray(numeros);
        
    }
    
}
