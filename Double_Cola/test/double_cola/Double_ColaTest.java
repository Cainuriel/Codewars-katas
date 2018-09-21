/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package double_cola;

import javafx.scene.shape.Line;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cainuriel
 */
public class Double_ColaTest {

    public Double_ColaTest() {
    }

    @Test
    public void crecerenparejas() {

    }

    @Test
    public void test1() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        Double_Cola one = new Double_Cola();
        int n = 1;
        assertEquals("Sheldon", one.WhoIsNext(names, n));
    }

    @Test
    public void test2() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        Double_Cola two = new Double_Cola();
        int n = 6;
        assertEquals("Sheldon", two.WhoIsNext(names, n));
    }

    @Test
    public void test3() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        Double_Cola three = new Double_Cola();
        int n = 9;
        assertEquals("Leonard", three.WhoIsNext(names, n));
    }

    

}
