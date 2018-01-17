/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.teste.persistencia;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Semestre;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rafaelgentil
 */
public class TestConecao {
    
    public TestConecao() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
         boolean excecao = false;
         
         try {
             DaoGenerico<Semestre> dg = new DaoGenerico<>();
             
         } catch (Exception e) {
             excecao = true;
             e.printStackTrace();
         }
         
         Assert.assertEquals(false, excecao);
     }
}
