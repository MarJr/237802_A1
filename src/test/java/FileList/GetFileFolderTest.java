/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileList;

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
public class GetFileFolderTest {

    public GetFileFolderTest() {
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
     * Test of listFolderFile method, of class GetFileFolder.
     */
    @Test
    public void testListFolderFile() {
        System.out.println("listFolderFile");
        File folder = new File("C:\\Users\\Mar Jr\\Documents\\NetBeansProjects\\Real_Time_Asg1\\File");
        GetFileFolder instance = new GetFileFolder();
        instance.listFolderFile(folder);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addFile method, of class GetFileFolder.
     */
    @Test
    public void testAddFile() {
        System.out.println("addFile");
        String fileExt = "test.java";
        GetFileFolder instance = new GetFileFolder();
        instance.addFile(fileExt);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of javaExt method, of class GetFileFolder.
     */
    @Test
    public void testJavaExt() {
        System.out.println("javaExt");
        String ext = "java";
        GetFileFolder instance = new GetFileFolder();
        boolean expResult = true;
        boolean result = instance.javaExt(ext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getFileList method, of class GetFileFolder.
     */
    @Test
    public void testGetFileList() {
        System.out.println("getFileList");
        GetFileFolder instance = new GetFileFolder();
        String[] expResult = {};
        String[] result = instance.getFileList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of dispFile method, of class GetFileFolder.
     */
    @Test
    public void testDispFile() {
        System.out.println("dispFile");
        GetFileFolder instance = new GetFileFolder();
        String expResult = "";
        String result = instance.dispFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of numberFile method, of class GetFileFolder.
     */
    @Test
    public void testNumberFile() {
        System.out.println("numberFile");
        GetFileFolder instance = new GetFileFolder();
        int expResult = 0;
        int result = instance.numberFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
