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
@Table(name = "departamento")
public class Departamento implements Serializable, EntidadeBase{
   @Id
   @SequenceGenerator(name = "seq_departamento", sequenceName = "seq_departamento_id", allocationSize = 1)
   @GeneratedValue(generator = "seq_departamento", strategy = GenerationType.SEQUENCE)
   private Long id;
   @Column(name = "nome", nullable = false, length = 255)
   private String nome;

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

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
     
    
}
