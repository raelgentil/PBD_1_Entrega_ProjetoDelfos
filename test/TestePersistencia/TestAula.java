/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestePersistencia;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Aula;
import br.com.delfos.modelo.entidades.Turma;
import java.util.Calendar;
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
public class TestAula {
    
    public TestAula() {
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
             
             Calendar c = Calendar.getInstance();
             c.set(2016, 03-1, 20);
             
            DaoGenerico<Turma> turDAO = new DaoGenerico<>();
            Turma turPesq = turDAO.encontrarId(Turma.class, 1L);
            
            DaoGenerico<Aula> aulDAO = new DaoGenerico<>();
             Aula aula = new Aula("null", true, "Laboratorio", c, turPesq);
             aulDAO.salvarOuAtualizar(aula);
             Aula aulPesq = aulDAO.encontrarId(Aula.class, 1L);
             System.out.println("Peguei o \n" + aulPesq.toString());

             
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
