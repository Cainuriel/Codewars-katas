/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cainu
 */
public class TimeFormatter {

    static int date[] = {31536000, 86400, 3600, 60};

    static String words[] = {" years", " days", " hours", " minutes", " year", " day", " hour", " minute"};

    public static int Duration(int seconds, int[] meter) {

        for (int i = 0; i < date.length; i++) {
            if (seconds < date[i]) {
                meter[i] = 0;

            } else if (seconds >= date[i]) {
                meter[i] = seconds / date[i];
                seconds = seconds - (meter[i] * date[i]);

            }

        }
        return seconds;
    }

    public static String Print(String[] result) {
        String cadena = "";
        int count[] = new int[4];
        int words = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                count[i] = 1;
                words++;
            }
        }
        if (words == 0) {
            return cadena;
        } else if (words == 1) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return cadena = result[i];
                }
            }
        } else {
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    cadena = cadena + result[i];
                    words--;
                    if (words != 0) {
                        cadena = cadena + ", ";
                    }
                }
            }

        }

        return cadena;
    }

    public static String formatDuration(int seconds) {
        String resultstring;
        resultstring = "";
        int[] meter = new int[4];
        String result[] = new String[4];
        seconds = Duration(seconds, meter);

        for (int i = 0; i < date.length; i++) {
            if (meter[i] == 1) {
                result[i] = String.valueOf(meter[i]);
                // se suma cuatro para alcanzar las palabras en singular
                //dentro de la array de palabras
                result[i] = result[i] + words[i + 4];

            } else if (meter[i] > 1) {

                result[i] = String.valueOf(meter[i]);
                result[i] = result[i] + words[i];

            }

        }
        resultstring = Print(result);

        if (seconds == 0 && resultstring.equalsIgnoreCase("")) {
            return "now";
        } else if (seconds == 0) {
            int index = resultstring.lastIndexOf(", ");
            if (index != (-1)) {
                String last = resultstring.substring(index);
                String replace = last.replace(", ", " and ");
                String beginning = resultstring.substring(0, index);
                resultstring = beginning + replace;
                return resultstring;
            } else {
                System.out.println("esto es " + resultstring);
                return resultstring;
            }

        }
        if (seconds == 1 && resultstring.equalsIgnoreCase("")) {
            return resultstring = seconds + " second";
        } else if (seconds == 1) {
            resultstring = resultstring + " and " + seconds + " second";
            return resultstring;
        }

        if (resultstring.equalsIgnoreCase("")) {
            return resultstring = seconds + " seconds";
        } else {
            resultstring = resultstring + " and " + seconds + " seconds";
        }

        return resultstring;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(formatDuration(34566453));

        /*    String aguja = ", ";

        String pajar = "tienes, que, sustituir, la ultima coma, esta.";

        int indice = pajar.lastIndexOf(aguja);

        String sub2 = pajar.substring(indice);
        String prueba = sub2.replace(", ", " and ");

        String sub1 = pajar.substring(0, indice);
        pajar = sub1 + prueba;

        System.out.println(pajar);*/
    }

}
