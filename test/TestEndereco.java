/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Endereco;
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
public class TestEndereco {
    
    public TestEndereco() {
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

             
             DaoGenerico<Municipio> munDAO = new DaoGenerico<>();
             Municipio muniPesq = munDAO.encontrarId(Municipio.class, 1l);
             System.out.println("Peguei o \n" + muniPesq.toString());
            
            DaoGenerico<Endereco> endDAO = new DaoGenerico<>();
            Endereco end = new Endereco();
            end.setBairro("Centro");
            end.setCep(022);
            end.setComplemento("casa");
            end.setDescricao("Rua JOse");
            end.setNumero("12B");
            end.setMunicipio(muniPesq);
            
            endDAO.salvarOuAtualizar(end);
            Endereco endPeq = endDAO.encontrarId(Endereco.class, end.getId());
            System.out.println("Peguei o \n" + endPeq.toString());
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
