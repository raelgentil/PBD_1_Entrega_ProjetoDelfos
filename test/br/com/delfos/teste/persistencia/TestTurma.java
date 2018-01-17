/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.teste.persistencia;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Aula;
import br.com.delfos.modelo.entidades.Turma;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
                   
//             DaoGenerico<Semestre> semDAO = new DaoGenerico<>();
//             Semestre semestrePesq = semDAO.encontrarId(Semestre.class, 1L);
//             System.out.println("Peguei o \n" + semestrePesq.toString());
//             
//             DaoGenerico<Professor> profDAO = new DaoGenerico<>();
//             Professor profPesq = profDAO.encontrarId(Professor.class, 2L);
//             System.out.println("Peguei o \n" + profPesq.toString());
////             
//             DaoGenerico<Disciplina> discDAO = new DaoGenerico<>();
//             Disciplina discPesq = discDAO.encontrarId(Disciplina.class, 1L);
//             System.out.println("Peguei o \n" + discPesq.toString());
             
              DaoGenerico<Turma> turmaDAO = new DaoGenerico<>();
//            Turma turma = new  Turma("154511sdfsd", 50,"2016.1SDMK", "seg;18:00;22:00/quar;20:10;22:00", semestrePesq, profPesq, discPesq);
              Calendar data = Calendar.getInstance();
              data.set(2016, 1, 15, 8, 10);
              
              List<Aula> aulas = new ArrayList<>();
              aulas.add(new Aula("Aula boa", true, "pratica", data));
              
              data.set(2016, 2, 12, 6, 30);
              aulas.add(new Aula("Aula ruim", true, "teorica", data));
              Turma tu = new Turma("1232", 50, "MAT2016.1", "wedwe6111515dewd4554", aulas);
            turmaDAO.salvarOuAtualizar(tu);
            
            Turma turmaPesq = turmaDAO.encontrarId(Turma.class, 1L);
            System.out.println("Peguei o \n" + turmaPesq.toString());
            
            

             
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
