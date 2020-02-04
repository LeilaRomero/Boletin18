package bol18_1;

/**
 *
 * @author Leila
 */
public class Metodos {
   
    public int[]crearArray(int[]Lista){
        for(int i=0; i<Lista.length;i++){
            Lista[i]=(int) (Math.random()*50);
        }
         return Lista;   
    }
    
    public void visualizarArray(int[] Lista){
        int maxima=Lista.length-1;
        for(int i=0;i<Lista.length;i++){
            System.out.println(Lista[maxima]);
            maxima--;
        }
    }
}
