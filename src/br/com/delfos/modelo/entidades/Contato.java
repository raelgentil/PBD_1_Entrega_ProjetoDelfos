/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import br.com.delfos.modelo.dao.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class Contato implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_contato", sequenceName = "seq_contato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_contato", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", tipo=" + tipo + ", descricao=" + descricao + '}';
    }

    
    
    
}
