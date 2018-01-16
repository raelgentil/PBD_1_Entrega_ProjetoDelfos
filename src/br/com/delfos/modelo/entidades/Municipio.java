/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class Municipio implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_municipio", sequenceName = "seq_municipio_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_municipio", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "cep", nullable = false)
    private int cep;
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "estado_id", referencedColumnName = "id", nullable = false)
    private Estado estado;

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
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
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

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id=" + id + ", cep=" + cep + ", descricao=" + descricao + ", estado=" + estado + '}';
    }
    
    
    
}
