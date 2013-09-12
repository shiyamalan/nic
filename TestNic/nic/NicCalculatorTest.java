/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shiyam
 */
public class NicCalculatorTest {
    NicCalculator instance;
    public NicCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NicCalculator("911081318V");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class NicCalculator.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        NicCalculator instance = null;
        instance.calculate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class NicCalculator.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        NicCalculator instance = null;
        String expResult = "";
        String result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class NicCalculator.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
       // NicCalculator instance = null;
        String expResult = "";
        String result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class NicCalculator.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        NicCalculator instance = null;
        String expResult = "";
        String result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class NicCalculator.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        NicCalculator instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVoter method, of class NicCalculator.
     */
    @Test
    public void testIsVoter() {
        System.out.println("isVoter");
        NicCalculator instance = null;
        boolean expResult = false;
        boolean result = instance.isVoter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
