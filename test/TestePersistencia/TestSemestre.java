package TestePersistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TestSemestre {
    
    public TestSemestre() {
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
            
            
            DaoGenerico<Semestre> semestDAO = new DaoGenerico<>();
//            Calendar c1 = Calendar.getInstance();
//            c1.set(2016, 01-1, 20, 0, 0, 0);
//            Calendar c2 = Calendar.getInstance();
//            c2.set(2016, 06-1, 01, 11, 59, 59);
//            Semestre s= new Semestre("2016.1", c1, c2);
//             
//
//
//            semestDAO.salvarOuAtualizar(s);
            Semestre semestrePesq = semestDAO.encontrarId(Semestre.class, 1L);
             System.out.println("Peguei o \n" + semestrePesq.toString());

             
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
