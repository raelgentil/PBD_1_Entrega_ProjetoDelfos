package TestePersistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Aluno;
import br.com.delfos.modelo.entidades.Contato;
import br.com.delfos.modelo.entidades.Endereco;
import java.util.ArrayList;
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
public class TestAluno {
    
    public TestAluno() {
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
           DaoGenerico<Endereco> endDAO = new DaoGenerico<>();
            Endereco endPeq = endDAO.encontrarId(Endereco.class, 4l);
            System.out.println("Peguei o \n" + endPeq.toString());
            
            
            DaoGenerico<Aluno> alunoDAO = new DaoGenerico<>();
            Aluno aluno = new Aluno();
            aluno.setCpf("123456789");
            aluno.setEndereco(endPeq);
            aluno.setLogin("Rafa123");
            aluno.setMatricula(1234556);
            aluno.setNome("Rafael Gentil");
            aluno.setSenha("Rafae123");
             Contato cont1 = new Contato();
             cont1.setDescricao("rael@goadfdk");
             cont1.setTipo("Email");
             Contato cont2 = new Contato();
             cont2.setDescricao("96345157");
             cont2.setTipo("Celular");
             List<Contato> contatos = new ArrayList<>();
             
             contatos.add(cont2);
             contatos.add(cont1);
             
            aluno.setContatos(contatos);
            alunoDAO.salvarOuAtualizar(aluno);
            
            Aluno alunoPeq = alunoDAO.encontrarId(Aluno.class, aluno.getId());
             System.out.println("Peguei o \n" + alunoPeq.toString());
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
