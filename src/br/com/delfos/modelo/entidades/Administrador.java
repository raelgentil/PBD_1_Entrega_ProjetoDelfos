/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author rafaelgentil
 */
@Entity
@Table(name = "adm")
public class Administrador implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_adm", sequenceName = "seq_adm_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_adm", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "login", nullable = false, length = 11)
    private String login;
    @Column(name = "senha", nullable = false, length = 11)
    private String senha;

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

    @Override
    public String toString() {
        return "Administrador{" + "id=" + id + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
    
}
