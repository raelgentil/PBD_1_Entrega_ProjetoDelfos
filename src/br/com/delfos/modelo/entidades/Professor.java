/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import br.com.delfos.modelo.dao.EntidadeBase;
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

    

    @Override
    public String toString() {
        return "Professor{" + "id=" + getId() + ", nome=" + getNome() + ", cpf=" + getCpf() + ", matricula=" + getMatricula() + ", login=" + getLogin() + ", senha=" + getSenha() + ", statutsVinculo=" + isStatutsVinculo() + ", cordenador=" + isCordenador() + ", departamento=" + getDepartamento() + ", endereco=" + getEndereco() + ", contatos=" + getContatos() + '}';
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the statutsVinculo
     */
    public boolean isStatutsVinculo() {
        return statutsVinculo;
    }

    /**
     * @param statutsVinculo the statutsVinculo to set
     */
    public void setStatutsVinculo(boolean statutsVinculo) {
        this.statutsVinculo = statutsVinculo;
    }

    /**
     * @return the cordenador
     */
    public boolean isCordenador() {
        return cordenador;
    }

    /**
     * @param cordenador the cordenador to set
     */
    public void setCordenador(boolean cordenador) {
        this.cordenador = cordenador;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contatos
     */
    public List<Contato> getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }


    
    
}
