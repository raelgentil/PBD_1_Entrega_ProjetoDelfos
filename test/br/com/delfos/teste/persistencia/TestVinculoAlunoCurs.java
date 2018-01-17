package br.com.delfos.teste.persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Aluno;
import br.com.delfos.modelo.entidades.Curso;
import br.com.delfos.modelo.entidades.Semestre;
import br.com.delfos.modelo.entidades.VinculoAlunoCurso;
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
public class TestVinculoAlunoCurs {
    
    public TestVinculoAlunoCurs() {
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
             DaoGenerico<Curso> cursoDAO = new DaoGenerico<>();
            Curso cursoPesq = cursoDAO.encontrarId(Curso.class, 1L);
             System.out.println("\nPeguei o \n" +cursoPesq.toString());
            
            DaoGenerico<Aluno> alunoDAO = new DaoGenerico<>();
            Aluno alunoPesq = alunoDAO.encontrarId(Aluno.class, 1L);
             System.out.println("\nPeguei o \n" + alunoPesq.toString());
            
            DaoGenerico<Semestre> semestDAO = new DaoGenerico<>();
            Semestre semestrePesq = semestDAO.encontrarId(Semestre.class, 1L);
             System.out.println("\nPeguei o \n" + semestrePesq.toString());
             
             DaoGenerico<VinculoAlunoCurso> vinDAO = new DaoGenerico<>();
             VinculoAlunoCurso vin = new VinculoAlunoCurso(true, semestrePesq, alunoPesq, cursoPesq);
             vinDAO.salvarOuAtualizar(vin);
             
             VinculoAlunoCurso vinPesq = vinDAO.encontrarId(VinculoAlunoCurso.class, 1L);
             System.out.println("\nPeguei o \n" + vinPesq.toString());
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
