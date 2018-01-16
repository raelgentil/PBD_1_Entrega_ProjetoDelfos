/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_inicio", nullable = false)
    private Calendar dataInicio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_termino", nullable = false)
    private Calendar dataTermino;

    private Semestre() {
    }

    

    public Semestre(String descricao, Calendar dataInicio, Calendar dataTermino) {
       
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public Semestre(Long id, String descricao, Calendar dataInicio, Calendar dataTermino) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the dataInicio
     */
    public Calendar getDataInicio() {
        return dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public Calendar getDataTermino() {
        return dataTermino;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(Calendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    
    
    @Override
    public String toString() {
        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        Date dataInicioo = dataInicio.getTime();
        Date dataTerminoo = dataTermino.getTime();
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        return "Semestre{" + "id=" + id + ", descricao=" + descricao + ", dataInicio=" + f2.format(dataInicioo) + ", dataTermino=" + f2.format(dataTerminoo) + '}';
    }

    
    
}
