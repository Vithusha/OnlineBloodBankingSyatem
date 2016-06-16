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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author CSE
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({controller.NotificationTest.class, controller.BB_servletTest.class, controller.Login_controllerTest.class, controller.ExampleTest.class, controller.View_DetailsTest.class, controller.bb_edit_servletTest.class, controller.Check_PasswordTest.class, controller.d_servletTest.class, controller.Req_servletTest.class, controller.BB_loginControllerTest.class, controller.View_bankDetailsTest.class, controller.d_edit_servletTest.class})
public class ControllerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
