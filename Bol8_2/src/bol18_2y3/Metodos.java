package bol18_2y3;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Metodos {

    public int[] crearArray(int[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            Lista[i] = (int) (Math.random() * ((10 - 0) + 1));
        }
        return Lista;
    }

    public String[] crearArray(String[]nombre){
        for(int i=0;i<nombre.length;i++){
            nombre[i]=JOptionPane.showInputDialog(null,"Introduzca nombre");
        }
        return nombre;
    }
    
    public void aproSus(int[] Lista) {
        int aprobados = 0, suspensos = 0;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Los aprobados son: " + aprobados + " Los suspensos son: " + suspensos);
    }

    public void media(int[] Lista) {
        int media = 0;
        for (int i = 0; i < Lista.length - 1; i++) {

            media = media + Lista[i];
        }
        media = media / Lista.length;
        JOptionPane.showMessageDialog(null, "La media de la clase es de: " + media);
    }

    public void notaAlata(int[] Lista) {
        int notaAlta = 0;
        for (int i = 0; i < Lista.length - 1; i++) {
            if (Lista[i] > notaAlta) {
                notaAlta = Lista[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mas alta de la clase es de: " + notaAlta);
    }

    public void notaOrdenada(int[] Lista, String[] nombre) {
        int aux;
        String auxnom;
        for (int i = 0; i < Lista.length - 1; i++) {
            for (int j = 0; j < Lista.length; j++) {
                if (Lista[i] > Lista[j]) {
                    aux = Lista[i];
                    Lista[i] = Lista[j];
                    Lista[j] = aux;
                    auxnom = nombre[i];
                    nombre[i] = nombre[j];
                    nombre[j] = auxnom;
                }
            }
        }
        for (int i = 0; i < Lista.length; i++) {
            JOptionPane.showMessageDialog(null, Lista[i] + nombre[i]);
        }
    }

    public void nota(int[] Lista, String[] nombre) {

        String buscado = JOptionPane.showInputDialog(null, "Introduzca nombre del alumno a buscar su nota");
        for (int i = 0; i < Lista.length - 1; i++) {
            for (int j = 0; j < nombre.length - 1; j++) {
                if (nombre[j].equals(buscado)) {
                    JOptionPane.showMessageDialog(null, "La nota de " + buscado + " es: " + Lista[i]);
                    break;
                }
            }
            break;
        }
    }
}
