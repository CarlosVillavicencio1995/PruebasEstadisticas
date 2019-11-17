/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
/**
 *
 * @author ALEJANDRO
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux="";
        int np=0;
        ArrayList<Double>n_pseudoaleatorios=new ArrayList<>();
        double valoresLista[] = {0.64138, 0.55837, 0.81593, 0.04994, 0.61265, 0.06787, 0.30465, 0.54264, 0.81159, 0.61163, 
                                 0.47681, 0.52127, 0.69239, 0.92006, 0.37913, 0.32035, 0.37248, 0.57836, 0.19180, 0.28920, 
                                 0.79302, 0.08124, 0.53401, 0.48201, 0.03268, 0.38087, 0.68054, 0.69251, 0.60284, 0.69351};
         
       for (int i = 0; i < valoresLista.length/3; i++) { 
            for (int j = 0; j < 10 ; j++) {
                if (np==valoresLista.length) {
                    break;
                }
                aux=aux+valoresLista[np]+", ";
                np++;
                
            }
            aux=aux+"\n";
        }
        System.out.println(""+aux);
        
        for (int i = 0; i < valoresLista.length; i++) {
            n_pseudoaleatorios.add(valoresLista[i]);
        }
        metodos_pruebas.prueba_Promedios(n_pseudoaleatorios);
        metodos_pruebas.prueba_Frecuencias(n_pseudoaleatorios);
        metodos_pruebas.prueba_Series(n_pseudoaleatorios);
        
    }
}

    

