/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mauricio
 */
public class TestMetodosTest {
    Metodos met;
    public TestMetodosTest() {
        met= new Metodos();
    }

    @Test
    public void testSumar() {
        
        assertTrue(met.suma(2, 2)==4);
    }
    @Test
    public void testSumar2() {
        
        assertEquals(met.suma(8, 2),(8+2));
    }
    
}
