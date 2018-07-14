/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cainu
 */
public class PigLatin {
    
          
     /*     int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = str.indexOf(" ");
        while (posicion != -1) { //mientras se encuentre el caracter
            index[contador] = posicion;
            contador++;
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = str.indexOf(" ", posicion + 1);
        }
        for (int x: index) {
            System.out.println(x);
        }*/
     

  
    
     public static String pigIt(String str) {

String s = "  ";
int index=0;
int doublespace=0;
if (str.contains(s)) {
index = str.indexOf(s);
doublespace++;
}
        System.out.println(index);
        int i;
        String result = "";
        String[] word = str.split("\\s+");
        
       

        for (i = 0; i < word.length; i++) {
            if (word[i].equals("")) {
            word[i]=" ";
             String part2 = word[i+1].substring(1, word[i+1].length());
             String part1 = word[i+1].substring(0,1);
                 return word[i] + part2 + part1 + "ay";
            }

            String part1 = word[i].substring(0,1);
            String part2 = word[i].substring(1, word[i].length());

            if (word[i].equalsIgnoreCase("!")|| word[i].equalsIgnoreCase("?")) {
            } else {
                 word[i] = part2 + part1 + "ay";
            }

        }
         if (word.length==1) {
            char fin=str.charAt(str.length()-1);
            char beginning=str.charAt(0);
            if (fin==' ') {
                word[0]=word[0]+Character.toString(fin);
                
            } else if (beginning==' ') {
                 word[0]=word[0]+Character.toString(beginning);
             } 
        }
        // evitamos el espacio al principio de la frase
        result=word[0];
        if (word.length>1) {
            for (i=0; i<word.length-1;i++) {
                result=result+" "+word[i+1];
            }
        }
        if (doublespace!=0) {
            String part2=result.substring(index+2);
            String part1=result.substring(0, index+2);
            result=part1+" "+part2;
        }

        return result;
    }
    
    
    

    }


