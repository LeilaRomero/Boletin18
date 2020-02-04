package bol18_4;

/**
 *
 * @author Leila
 */
public class Bol18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Realiza un programa que calcule a letra do NIF, Para eso fai o seguinte:
            Divide o nº do DNI entre 23, sen sacar decimais, e anota o resto da
            division.
            Mira na taboa asociada o resto.
        */
        
        Metodos NIF = new Metodos();
        int[] numero={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        char[] letra=new char []{'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
            NIF.LetraDNI(numero, letra);
    }
    
}
