/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyecto20200205.ProcesadorNumero;

/**
 *
 * @author Administrador
 */
public class ProcesadorNumeroTest {
    
    public ProcesadorNumeroTest() {
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
    
    //Prueba de ejercicio 1
    @Test
    public void descomponerNumeroRetornarListaNoNula()
    {
        ProcesadorNumero procesador = new ProcesadorNumero();
        ArrayList resultado = procesador.descomponerNumero(59);
        assertNotNull(resultado);
        
    }
    
    //Prueba de ejercicio 2
    @Test
    public void invertirNumero123es321()
    {
        ProcesadorNumero procesador = new ProcesadorNumero();
        int numero = procesador.invertirNumero(123);
        assertTrue(numero == 321);
    }
    
    
    //Prueba de ejercicio 3
    @Test
    public void convertirNumeroABinario43a101011()
    {
        ProcesadorNumero procesador = new ProcesadorNumero();
        int numero = procesador.convertirDesimalABinario(43);
        assertTrue(numero == 101011);
    }
    
    //Prueba de ejercicio 4
    @Test
    public void convertirNumeroCualquierBaseaDecimal()
    {
        ProcesadorNumero procesador = new ProcesadorNumero();
        int numero = procesador.convertirNumeroCualquierBaseADecimal("01000",2);
        int numero2 = procesador.convertirNumeroCualquierBaseADecimal("108A",16);
        assertTrue(numero == 8 && numero2 == 4234);
    }
    
    //Prueba de ejercicio 5
    @Test
    public void decifrarMensajeRetornaStringNoVacio()
    {
        ProcesadorNumero procesador = new ProcesadorNumero();
        String resultado = procesador.decifrarASCII();
        assertTrue(resultado.length() > 0);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
