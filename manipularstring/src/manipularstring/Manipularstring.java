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
public class Manipularstring {

    public static String pigIt(String str) {

        String[] words = str.split("\\s+");
        int sizestr = str.length();
        int[] index = new int[words.length];
        String result = "";


        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                words[i] = " ";
                String part2 = words[i + 1].substring(1, words[i + 1].length());
                String part1 = words[i + 1].substring(0, 1);
                return words[i] + part2 + part1 + "ay";
            }

            String part1 = words[i].substring(0, 1);
            String part2 = words[i].substring(1, words[i].length());

            if (words[i].equalsIgnoreCase("!") || words[i].equalsIgnoreCase("?")) {
            } else {
                words[i] = part2 + part1 + "ay";
            }

        }

        int j = 0;
        int i = 0;
        do {

            if (str.charAt(i) == ' ') {
                result = result + " ";
                System.out.println("ehhhh " + i);
                                    i++;
            } else {
                result = result + words[j];
                System.out.println(result);
                if (words[j].equalsIgnoreCase("!") || words[j].equalsIgnoreCase("?") 
                        || words[j].length()==3) {
                    j++;
                    i++;
                } else {
                    i = i + words[j].length() - 2;
                    j++;

                }

            }
        } while (i < str.length());

        return result;
    }

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        String dame = pigIt("  jDMKaubZc");
        System.out.println(dame + "-");

    }

}
