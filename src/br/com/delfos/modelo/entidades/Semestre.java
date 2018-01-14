/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import br.com.delfos.modelo.dao.EntidadeBase;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "semestre")
public class Semestre implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_semestre", sequenceName = "seq_semestre_id", initialValue = 1)
    @GeneratedValue(generator = "seq_semestre", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "descricao", nullable = false, length = 20)
    private String descricao;
    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;
    @Column(name = "data_termino", nullable = false)
    private LocalDate dataTermino;

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
     * @return the dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public LocalDate getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Semestre{" + "id=" + id + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + '}';
    }

    
    
}
