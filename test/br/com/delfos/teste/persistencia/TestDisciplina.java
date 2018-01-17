package br.com.delfos.teste.persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Curso;
import br.com.delfos.modelo.entidades.Disciplina;
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
public class TestDisciplina {
    
    public TestDisciplina() {
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
             
//              DaoGenerico<Curso> cursoDAO = new DaoGenerico<>();
//             Curso cursoPesq = cursoDAO.encontrarId(Curso.class,1L);
//            System.out.println("Peguei o \n" + cursoPesq.toString());



             DaoGenerico<Disciplina> discDAO = new DaoGenerico<Disciplina>();
//             
             DaoGenerico<Curso> cursoDAO = new DaoGenerico<Curso>();
             Curso curPesq = cursoDAO.encontrarId(Curso.class, 1L);
             System.out.println("Peguei o \n" +  curPesq.toString());
             
             Disciplina disc = new Disciplina("Calculo", 60, "Disciplina voltada para que os alunos possam "
                     + "desenvolver o máximo de conhecimento para disciplinas futuras,"
                     + " pois as cadeiras que necessitão de prerequisitos vão precisar de muito "
                     + "conlhecimento nessa area de cadeiras passadas por isso é bom"
                     + " q o aluno tenho todo conhecimento necessario", curPesq);
            discDAO.salvarOuAtualizar(disc);
            Disciplina discPesq = discDAO.encontrarId(Disciplina.class, 1L);
             System.out.println("Peguei o \n" +  discPesq);

             
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
