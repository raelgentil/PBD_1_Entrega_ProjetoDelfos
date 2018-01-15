/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Professor;
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
public class TestProf {
    
    public TestProf() {
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
//           DaoGenerico<Endereco> endDAO = new DaoGenerico<>();
//            Endereco endPeq = endDAO.encontrarId(Endereco.class, 4l);
//            System.out.println("Peguei o \n" + endPeq.toString());
//            
//            DaoGenerico<Departamento> depDAO = new DaoGenerico<>();
//            Departamento depPeq = depDAO.encontrarId(Departamento.class, 1L);
//            System.out.println("Peguei o \n" + depPeq.toString());
//            
            DaoGenerico<Professor> profDAO = new DaoGenerico<>();
//            Professor prof = new Professor();
//            prof.setCordenador(true);
//            prof.setCpf("123456789");
//            prof.setDepartamento(depPeq);
//            prof.setEndereco(endPeq);
//            prof.setLogin("Rafa123");
//            prof.setMatricula(1234556);
//            prof.setNome("Rafael Gentil");
//            prof.setSenha("Rafae123");
//            prof.setStatutsVinculo(true);
//             Contato cont1 = new Contato();
//             cont1.setDescricao("rael@goadfdk");
//             cont1.setTipo("Email");
//             Contato cont2 = new Contato();
//             cont2.setDescricao("96345157");
//             cont2.setTipo("Celular");
//             List<Contato> contatos = new ArrayList<>();
//             
//             contatos.add(cont2);
//             contatos.add(cont1);
//             
//            prof.setContatos(contatos);
//            profDAO.salvarOuAtualizar(prof);
            
            Professor profPeq = profDAO.encontrarId(Professor.class, 2l);
             System.out.println("Peguei o \n" + profPeq.toString());
              
         } catch (Exception e) {
             exption = true;
             e.printStackTrace();
         }
         Assert.assertEquals(false, exption);
     }
}
