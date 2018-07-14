/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipularstring;

/**
 *
 * @author cainu
 */


public class Latin {
    
    public static String pigIt(String str) {
        
        String[] words = str.split("\\s+");
        int[] sizewords = new int[words.length];
        int[] index = new int[words.length + 2];
        int i=0;
        for (String s: words) {
            sizewords[i] = s.length();
            i++;
        }
          int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = str.indexOf(" ");
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;
            index[contador] = posicion;
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = str.indexOf(" ", posicion + 1);
        }
        System.out.println(contador);
        
        
        return "";
        
    }
    
    
}
