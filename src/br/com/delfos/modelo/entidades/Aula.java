/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class Aula implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_aula", sequenceName = "seq_aula_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_aula", strategy = GenerationType.SEQUENCE)    
    private Long id;
    @Column(name = "observacao", nullable = false, length = 255)
    private String observacao;
    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora_inicio", nullable = false)
    private Calendar dataHoraInicio;

    
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "turma_id", referencedColumnName = "id", nullable = false)
//    private Turma turma;
    

    private Aula() {
    }

    public Aula(String observacao, boolean status, String descricao, Calendar dataHoraInicio) {
        this.observacao = observacao;
        this.status = status;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
    }

    
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", observacao=" + observacao + ", status=" + status + ", descricao=" + descricao + ", dataHoraInicio=" + dataHoraInicio + '}';
    }


    
    
     
     
    
}
