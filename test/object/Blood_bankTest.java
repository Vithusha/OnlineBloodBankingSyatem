/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CSE
 */
public class Blood_bankTest {
    
    public Blood_bankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_name method, of class Blood_bank.
     */
    @Test
    public void testGet_name() {
        System.out.println("get_name");
        String bb_name = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_name(bb_name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_address method, of class Blood_bank.
     */
    @Test
    public void testGet_address() {
        System.out.println("get_address");
        String bb_address = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_address(bb_address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_contact method, of class Blood_bank.
     */
    @Test
    public void testGet_contact() {
        System.out.println("get_contact");
        String bb_contact = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_contact(bb_contact);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_bankID method, of class Blood_bank.
     */
    @Test
    public void testGet_bankID() {
        System.out.println("get_bankID");
        String bb_bankID = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_bankID(bb_bankID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_username method, of class Blood_bank.
     */
    @Test
    public void testGet_username() {
        System.out.println("get_username");
        String bb_username = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_username(bb_username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_password method, of class Blood_bank.
     */
    @Test
    public void testGet_password() {
        System.out.println("get_password");
        String bb_password = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_password(bb_password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_rePassword method, of class Blood_bank.
     */
    @Test
    public void testGet_rePassword() {
        System.out.println("get_rePassword");
        String bb_rePassword = "";
        Blood_bank instance = new Blood_bank();
        String expResult = "";
        String result = instance.get_rePassword(bb_rePassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
