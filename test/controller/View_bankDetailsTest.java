/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class View_bankDetailsTest {
    
    public View_bankDetailsTest() {
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
     * Test of processRequest method, of class View_bankDetails.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_bankDetails instance = new View_bankDetails();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class View_bankDetails.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_bankDetails instance = new View_bankDetails();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class View_bankDetails.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_bankDetails instance = new View_bankDetails();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class View_bankDetails.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        View_bankDetails instance = new View_bankDetails();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_bbID method, of class View_bankDetails.
     */
    @Test
    public void testSet_bbID() {
        System.out.println("set_bbID");
        int id = 0;
        View_bankDetails instance = new View_bankDetails();
        instance.set_bbID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_bbID method, of class View_bankDetails.
     */
    @Test
    public void testGet_bbID() {
        System.out.println("get_bbID");
        View_bankDetails instance = new View_bankDetails();
        int expResult = 0;
        int result = instance.get_bbID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_BBname method, of class View_bankDetails.
     */
    @Test
    public void testGet_BBname() {
        System.out.println("get_BBname");
        View_bankDetails instance = new View_bankDetails();
        String expResult = "";
        String result = instance.get_BBname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_BBaddress method, of class View_bankDetails.
     */
    @Test
    public void testGet_BBaddress() {
        System.out.println("get_BBaddress");
        View_bankDetails instance = new View_bankDetails();
        String expResult = "";
        String result = instance.get_BBaddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_BBcontact method, of class View_bankDetails.
     */
    @Test
    public void testGet_BBcontact() {
        System.out.println("get_BBcontact");
        View_bankDetails instance = new View_bankDetails();
        String expResult = "";
        String result = instance.get_BBcontact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_BBusername method, of class View_bankDetails.
     */
    @Test
    public void testGet_BBusername() {
        System.out.println("get_BBusername");
        View_bankDetails instance = new View_bankDetails();
        String expResult = "";
        String result = instance.get_BBusername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBB_ID method, of class View_bankDetails.
     */
    @Test
    public void testGetBB_ID() {
        System.out.println("getBB_ID");
        View_bankDetails instance = new View_bankDetails();
        int expResult = 0;
        int result = instance.getBB_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
