package TestePersistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Estado;
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
public class TestEstado {
    
    public TestEstado() {
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
         boolean exption = false;
         
         try {
//             Estado estado = new Estado();
//             
//             estado.setUf("PE");
//             estado.setDescricao("PErnambuco");
             
//             DaoGenerico estadoDAO = new DaoGenerico();
             
//             estadoDAO.salvarOuAtualizar(estado);
             DaoGenerico<Estado> estadoDAO = new DaoGenerico<>();
//             estadoDAO.salvarOuAtualizar(estado);
          
             
             Estado estadoPesquisado = estadoDAO.encontrarId( Estado.class, 2L);
             
             System.out.println(estadoPesquisado.toString());
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
