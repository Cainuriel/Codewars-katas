/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extract_file_name;

/**
 *
 * @author cainu
 */
public class Extract_file_name {
    
    
    public static String detectingName(String file ) {
        String point =".";
        String ampersand ="&";
        String substitution;
        String name;
        
      int lastpoint = file.lastIndexOf(point);
      substitution=file.replaceFirst("_","&");
      int firstpoint = substitution.lastIndexOf(ampersand);
      name = substitution.substring(firstpoint+1, lastpoint);
        
        return  name;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String actual = "1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION";
        System.out.println(detectingName(actual));
    }
    
}
