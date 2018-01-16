package TestePersistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Curso;
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
public class TestCurso {
    
    public TestCurso() {
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
             
//            DaoGenerico<Departamento> depDAO = new DaoGenerico<>();
//            Departamento depPeq = depDAO.encontrarId(Departamento.class, 1L);
//            System.out.println("Peguei o \n" + depPeq.toString());
            DaoGenerico<Curso> cursoDAO = new DaoGenerico<>();
////            
//            Curso curso = new Curso();
//            curso.setDepartamento(depPeq);
//            curso.setNome("Matematica");
//            cursoDAO.salvarOuAtualizar(curso);

             Curso cursoPesq = cursoDAO.encontrarId(Curso.class,1L);
            System.out.println("Peguei o \n" + cursoPesq.toString());
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
