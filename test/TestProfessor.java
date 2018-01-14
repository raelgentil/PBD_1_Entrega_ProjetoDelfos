/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Contato;
import br.com.delfos.modelo.entidades.Departamento;
import br.com.delfos.modelo.entidades.Endereco;
import br.com.delfos.modelo.entidades.Estado;
import br.com.delfos.modelo.entidades.Municipio;
import br.com.delfos.modelo.entidades.Professor;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rafaelgentil
 */
public class TestProfessor {
    
    public TestProfessor() {
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
         boolean escepition = false;
         
         try {
             
        Estado e = new Estado();
        e.setDescricao("Pernambuco");
        e.setUf("PE");
        DaoGenerico<Estado> estadoDao = new DaoGenerico<>();
        estadoDao.salvarOuAtualizar(e);
        
        Municipio m = new Municipio();
                m.setCep(123);
                m.setDescricao("Floresta");
                m.setEstado(e);
       DaoGenerico<Municipio> municipioDao = new DaoGenerico<Municipio>();
       municipioDao.salvarOuAtualizar(m);
        Endereco end = new Endereco();
        
        end.setBairro("Centro");
        end.setCep(123);
        end.setComplemento("Casa");
        end.setMunicipio(m);
        
        DaoGenerico<Endereco> endDao = new DaoGenerico<>();
        endDao.salvarOuAtualizar(end);
        
        
        Departamento depar = new Departamento();
        depar.setNome("Exatas e suas tecnologias");
        DaoGenerico<Departamento> depDao = new DaoGenerico<>();
        depDao.salvarOuAtualizar(depar);
       
        Professor prof = new Professor();
        prof.setNome("Rafael");
        prof.setCpf("1234567890");
        prof.setMatricula(123456789);
        prof.setLogin("login");
        prof.setSenha("senha");
        prof.setCordenador(true);
        prof.setStatutsVinculo(true);
        prof.setEndereco(end);
        
        prof.setDepartamento(depar);
        
        
        Contato cont = new Contato();
        cont.setDescricao("jwemwjedemjd");
        cont.setTipo("Email");
        
        
        List<Contato> contatos = new ArrayList<>();
        contatos.add(cont);
        cont.setDescricao("96345157");
        cont.setTipo("telefone");
        contatos.add(cont);
        
        prof.setContatos(contatos);
        
        DaoGenerico<Professor> profDao = new DaoGenerico<>();
         
        profDao.salvarOuAtualizar(prof);
        
        
             System.out.println(prof.toString());
             
         } catch (Exception e) {
             escepition = true;
             e.printStackTrace();
             
         }
         Assert.assertEquals(false, escepition);
     
     
     }
}
