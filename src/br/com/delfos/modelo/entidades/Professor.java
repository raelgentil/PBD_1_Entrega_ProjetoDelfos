/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class Professor implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_professor", sequenceName = "seq_professor_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_professor", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "nome", nullable = false, length = 255)
    private String nome;
    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;
    @Column(name = "matricula", nullable = false)
    private int matricula;
    @Column(name = "login", nullable = false, length = 11)
    private String login;
    @Column(name = "senha", nullable = false, length = 11)
    private String senha;
    @Column(name = "statuts_vinculo", nullable = false)
    private boolean statutsVinculo;
    @Column(name = "cordenador", nullable = false)
    private boolean cordenador;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departamento_id", referencedColumnName = "id", nullable = false)
    private Departamento departamento;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id", nullable = false)
    private Endereco endereco;
//    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @JoinColumn(name = "contato_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="Professor_contato",
             joinColumns={@JoinColumn(name = "professor_id")},
             inverseJoinColumns={@JoinColumn(name = "contato_id")})
    private List<Contato> contatos;

    private Professor() {}

    public Professor(String nome, String cpf, int matricula, String login, String senha, boolean statutsVinculo, boolean cordenador, Departamento departamento, Endereco endereco, List<Contato> contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.statutsVinculo = statutsVinculo;
        this.cordenador = cordenador;
        this.departamento = departamento;
        this.endereco = endereco;
        this.contatos = contatos;
    }

    public Professor(Long id, String nome, String cpf, int matricula, String login, String senha, boolean statutsVinculo, boolean cordenador, Departamento departamento, Endereco endereco, List<Contato> contatos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.statutsVinculo = statutsVinculo;
        this.cordenador = cordenador;
        this.departamento = departamento;
        this.endereco = endereco;
        this.contatos = contatos;
    }
    

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return the statutsVinculo
     */
    public boolean isStatutsVinculo() {
        return statutsVinculo;
    }

    /**
     * @return the cordenador
     */
    public boolean isCordenador() {
        return cordenador;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @return the contatos
     */
    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", login=" + login + ", senha=" + senha + ", statutsVinculo=" + statutsVinculo + ", cordenador=" + cordenador + ", departamento=" + departamento + ", endereco=" + endereco + ", contatos=" + contatos + '}';
    }

   
}
