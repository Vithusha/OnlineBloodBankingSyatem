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
public class View_DetailsTest {
    
    public View_DetailsTest() {
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
     * Test of processRequest method, of class View_Details.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_Details instance = new View_Details();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class View_Details.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_Details instance = new View_Details();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class View_Details.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        View_Details instance = new View_Details();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class View_Details.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_ID method, of class View_Details.
     */
    @Test
    public void testSet_ID() {
        System.out.println("set_ID");
        int id = 0;
        View_Details instance = new View_Details();
        instance.set_ID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_ID method, of class View_Details.
     */
    @Test
    public void testGet_ID() {
        System.out.println("get_ID");
        View_Details instance = new View_Details();
        int expResult = 0;
        int result = instance.get_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getfname method, of class View_Details.
     */
    @Test
    public void testGetfname() {
        System.out.println("getfname");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.getfname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlname method, of class View_Details.
     */
    @Test
    public void testGetlname() {
        System.out.println("getlname");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.getlname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_dob method, of class View_Details.
     */
    @Test
    public void testGet_dob() {
        System.out.println("get_dob");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_dob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getb_group method, of class View_Details.
     */
    @Test
    public void testGetb_group() {
        System.out.println("getb_group");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.getb_group();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_contact method, of class View_Details.
     */
    @Test
    public void testGet_contact() {
        System.out.println("get_contact");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_contact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_username method, of class View_Details.
     */
    @Test
    public void testGet_username() {
        System.out.println("get_username");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_lastDonation method, of class View_Details.
     */
    @Test
    public void testGet_lastDonation() {
        System.out.println("get_lastDonation");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_lastDonation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_password method, of class View_Details.
     */
    @Test
    public void testGet_password() {
        System.out.println("get_password");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_password();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_gender method, of class View_Details.
     */
    @Test
    public void testGet_gender() {
        System.out.println("get_gender");
        View_Details instance = new View_Details();
        String expResult = "";
        String result = instance.get_gender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
