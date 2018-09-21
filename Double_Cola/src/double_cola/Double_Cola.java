/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package double_cola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cainu
 */
public class Double_Cola {

    public static String[] names = new String[]{"Sheldon", "Leonard",
        "Penny", "Rajesh", "Howard"};

    public static void crecerenparejas(int n) {
        Map<Integer, Integer> grupos = new HashMap<Integer, Integer>();
        ArrayList<Integer> sumatoria = new ArrayList();
        ArrayList<Integer> tuplas = new ArrayList();
        ArrayList<Integer> counter = new ArrayList();
        int x = 0, i = 1, count = 0, tupla = 1;
        int result = n;
        while (x < n) {
            x = x + (5 * i);
            tupla = tupla * 2;
            count++;
            sumatoria.add(x);
            tuplas.add(tupla);
            counter.add(count);
            System.out.println("sumatoria " + sumatoria);
            System.out.println("tupla: " + tuplas);
            System.out.println(counter);
            i = i * 2;
            grupos.put(x, count);
        }
        System.out.println("potencia de count " + Math.pow(2, count));
    }

    // mejor solucion 
    public static String WhoIsNext2(String[] names, int n) {
        while (n > names.length) {
            n = (n - (names.length - 1)) / 2;
        }
        return names[n - 1];
    }

    public static String WhoIsNext(String[] names, int n) {
        int subtraction = n;
        int exponent = 1, j = 0, start = 0, size = 0, person = 0;
        ArrayList<Integer> summation = new ArrayList();
        summation.add(0);

        if (n > names.length) {
            /**
             * @param summation the space that is generated with the five
             * (names) ^ exponential makes a loop.
             * @param subtraction subtract in blocks: to know the starting
             * height of the loop
             * @param exponent every loop names * names: 1 2 4 8 16...
             */
            while (subtraction > 2) {
                summation.add((summation.get(j) + (names.length * exponent)));
                subtraction = subtraction - summation.get(j + 1);
                exponent = exponent * 2;
                j++;
            }

            size = summation.size();

            /**
             * // we look for the block closest to number.
             *
             * @param start starting point to search for a name
             */
            if (summation.get(size - 1) > n) {
                start = summation.get(size - 2);
                exponent = exponent / 2;
            } else {
                start = summation.get(summation.size() - 1);
            }
            // the exponent will determine the group of names that are generated in a block
            while (start < n) {
                if (person == names.length) {
                    person = 0;
                    exponent = (exponent + exponent);
                }

                start = start + exponent;
                person = person + 1;
            }
        } else {
            person = n;
        }

        return names[person - 1];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crecerenparejas(76);
        System.out.println(WhoIsNext(names, 10485758));

        System.out.println(WhoIsNext2(names, 10485758));
    }

    // metodo con arrays que se relantizaba:
    /*public static String WhoIsNext(String[] names, int n) {
        ArrayList<String> copia = new ArrayList();
        int bucle = n;
        int loop = 1, j = 0;
        int inside;
        for (String s : names) {
            copia.add(s);
        }
        int sumatoria [] = {5, 15, 35, 75, 155, 315, 635, 1275, 2555, 5115, 
        10235, 20475, 40955, 81915, 163835, 327675, 655355, 1310715, 2621435, 
        5242875, 10485755, 20971515, 41943035, 83886075, 167772155, 335544315, 
        671088635, 1342177275};
        
        if (n > 5) {
            while (bucle > 5) {
                bucle = (bucle - sumatoria[j]);
                System.out.println("             Quedan en la cola: "+ bucle);
                loop = loop * 2;
                System.out.println("                  Turnos " + loop);
                j++;
                for (int i = 0; i < names.length; i++) {
                    inside = loop;

                    while (inside > 0) {
                        copia.add(copia.get(i));
                        inside = inside - 1;
                        System.out.println("entro? " + inside);
                    }
                }
            }
        }

        return copia.get(n-1);
    } */
}
