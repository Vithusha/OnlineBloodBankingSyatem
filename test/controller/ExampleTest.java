/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class ExampleTest {
    
    public ExampleTest() {
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
     * Test of sendSMS method, of class Example.
     */
    @Test
    public void testSendSMS() {
        System.out.println("sendSMS");
        String phone_num = "+94772069460";
        String accept_num = "+94775364758";
        String bank = "Katubedda";
        String name = "Thilini";
        Example instance = new Example();
        instance.sendSMS(phone_num, accept_num, bank, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
