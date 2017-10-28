/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Issue;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mar Jr
 */
public class CountingIssueTest {

    public CountingIssueTest() {
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
     * Test of calIssue method, of class CountingIssue.
     */
    @Test
    public void testCalIssue() {
        System.out.println("calIssue");
        File folder = new File("C:\\Users\\Mar Jr\\Documents\\NetBeansProjects\\Real_Time_Asg1\\File");
        String[] ext = {};
        CountingIssue instance = new CountingIssue();
        int expResult = 0;
        int result = instance.calIssue(folder, ext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIssue method, of class CountingIssue.
     */
    @Test
    public void testSetIssue() {
        System.out.println("setIssue");
        int count = 0;
        CountingIssue instance = new CountingIssue();
        instance.setIssue(count);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIssue method, of class CountingIssue.
     */
    @Test
    public void testGetIssue() {
        System.out.println("getIssue");
        CountingIssue instance = new CountingIssue();
        int expResult = 0;
        int result = instance.getIssue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
