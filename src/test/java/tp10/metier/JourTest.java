/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp10.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lenovo
 */
public class JourTest {
    
    public JourTest() {
    }

    @org.junit.jupiter.api.Test
    public void testConstructor() {
        Integer numJour = 3;
        Jour j1 = new Jour(numJour);
        
        Integer result = j1.getNoJour();
        Assertions.assertEquals(numJour, result,  "L'entier utilisé ");
    }
    
    
}
