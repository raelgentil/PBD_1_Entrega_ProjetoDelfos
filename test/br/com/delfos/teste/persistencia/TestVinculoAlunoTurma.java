/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.teste.persistencia;

import br.com.delfos.modelo.dao.DaoGenerico;
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
public class TestVinculoAlunoTurma {
    
    public TestVinculoAlunoTurma() {
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
             
             DaoGenerico<Turma> turmDAO = new DaoGenerico<>();
//             Turma turmPesq = turmDAO.encontrarId(Turma.class, 1L);
//             System.out.println("\nPeguei o \n" +turmPesq.toString());
             
//             DaoGenerico<VinculoAlunoCurso> vinDAO = new DaoGenerico<>();
//             VinculoAlunoCurso vinPesq = vinDAO.encontrarId(VinculoAlunoCurso.class, 1L);
//             System.out.println("\nPeguei o \n" + vinPesq.toString());
//             
//             DaoGenerico<VinculoAlunoTurma> VinTurDAO = new DaoGenerico<>();
//             VinculoAlunoTurma vinculoAlunoTurma = new VinculoAlunoTurma(9.0, 8.0, 7.0, 5.0, 8.0, 9.0, 8,"Aprovado");
//            VinTurDAO.salvarOuAtualizar(vinculoAlunoTurma);
//            
//            VinculoAlunoTurma vinculoAlunoTurmaPesq = VinTurDAO.encontrarId(VinculoAlunoTurma.class, 1L);
//            System.out.println("\nPeguei o \n" + vinculoAlunoTurmaPesq.toString());
//            
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
