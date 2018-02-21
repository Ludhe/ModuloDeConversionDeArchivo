/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.tpi135_2018.practica.mantenimiento.mantenimientolib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author doratt
 */
public class ManejoDeArchivosTest {
    
    public ManejoDeArchivosTest() {
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
     * Test of mostrarContenidoArchivo method, of class ManejoDeArchivos.
     */
    @Test
    public void testMostrarContenidoArchivo() {
        System.out.println("mostrarContenidoArchivo");
        String path = "src/test/resources/archivoPrueba.csv";
        ManejoDeArchivos instance = new ManejoDeArchivos();
        boolean expResult = false;
        boolean result = instance.mostrarContenidoArchivo(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
