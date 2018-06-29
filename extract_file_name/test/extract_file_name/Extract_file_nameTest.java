/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extract_file_name;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cainu
 */
public class Extract_file_nameTest {
    
   

    /**
     * Test of main method, of class Extract_file_name.
     */
    @Test
    public void testMain() {
        
        String actual = "1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION";
        String expected = "FILE_NAME.EXTENSION";
        String actual2 = "1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34";
        String expected2 ="This_is_an_otherExample.mpg";
        String actual3 = "1231231223123131_myFile.tar.gz2";
        String expected3 = "myFile.tar";
        assertEquals("name no detectated",expected, Extract_file_name.detectingName(actual));
        assertEquals("name no detectated",expected2, Extract_file_name.detectingName(actual2));
        assertEquals("name no detectated",expected3, Extract_file_name.detectingName(actual3));
    }
    
}
