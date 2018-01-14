/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Estado;
import br.com.delfos.modelo.entidades.Municipio;
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
public class TestMunicipio {
    
    public TestMunicipio() {
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
     @Test
     public void test() {
         boolean exption = false;
         
         try {
//             
             DaoGenerico<Estado> estadoDAO = new DaoGenerico<>();
//           
             Estado estadoPesquisado = estadoDAO.encontrarId( Estado.class, 2L);
             
             System.out.println("Peguei o \n" + estadoPesquisado.toString());
             
             DaoGenerico<Municipio> munDAO = new DaoGenerico<>();
             
             Municipio m =  new Municipio();
             m.setCep(200);
             m.setDescricao("Floresta");
             m.setEstado(estadoPesquisado);
             
             munDAO.salvarOuAtualizar(m);
             
             Municipio muniPesq = munDAO.encontrarId(Municipio.class, m.getId());
              System.out.println("Peguei o \n" + muniPesq.toString());
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
