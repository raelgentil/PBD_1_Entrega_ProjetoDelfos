/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.aplicacao;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Contato;
import br.com.delfos.modelo.entidades.Departamento;
import br.com.delfos.modelo.entidades.Endereco;
import br.com.delfos.modelo.entidades.Estado;
import br.com.delfos.modelo.entidades.Municipio;
import br.com.delfos.modelo.entidades.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafaelgentil
 */
public class App {
    public static void main(String[] args) {
           
                     
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
        end.setDescricao("Rua jose barros");
        end.setNumero("100");
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
//         profDao.encontrarId(Professor.class, 2L);
        profDao.salvarOuAtualizar(prof);
               Professor profProcurado =  profDao.encontrarId(Professor.class, prof.getId());
//        
//             System.out.println(profProcurado.toString());




       
    }
    
}
