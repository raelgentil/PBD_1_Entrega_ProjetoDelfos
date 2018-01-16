/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestePersistencia;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Disciplina;
import br.com.delfos.modelo.entidades.Professor;
import br.com.delfos.modelo.entidades.Semestre;
import br.com.delfos.modelo.entidades.Turma;
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
public class TestTurma {
    
    public TestTurma() {
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
            
            DaoGenerico<Turma> turmaDAO = new DaoGenerico<>();
            
             DaoGenerico<Semestre> semDAO = new DaoGenerico<>();
             Semestre semestrePesq = semDAO.encontrarId(Semestre.class, 1L);
             System.out.println("Peguei o \n" + semestrePesq.toString());
             
             DaoGenerico<Professor> profDAO = new DaoGenerico<>();
             Professor profPesq = profDAO.encontrarId(Professor.class, 2L);
             System.out.println("Peguei o \n" + profPesq.toString());
//             
             DaoGenerico<Disciplina> discDAO = new DaoGenerico<>();
             Disciplina discPesq = discDAO.encontrarId(Disciplina.class, 1L);
             System.out.println("Peguei o \n" + discPesq.toString());
             
            
            Turma turma = new  Turma("154511sdfsd", 50,"2016.1SDMK", "seg;18:00;22:00/quar;20:10;22:00", semestrePesq, profPesq, discPesq);

            turmaDAO.salvarOuAtualizar(turma);
            
            Turma turmaPesq = turmaDAO.encontrarId(Turma.class, 1L);
            System.out.println("Peguei o \n" + turmaPesq.toString());
            
            

             
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
