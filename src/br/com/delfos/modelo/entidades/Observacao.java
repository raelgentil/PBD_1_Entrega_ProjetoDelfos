/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

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
public class Observacao {
    @Id
    @SequenceGenerator(name = "seq_observacao", sequenceName = "seq_observacao_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_observacao", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    
    private Observacao() {}

    public Observacao(String descricao) {
        this.id = id;
        this.descricao = descricao;
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

//    /**
//     * @return the vinculoAlunoTurma
//     */
//    public VinculoAlunoTurma getVinculoAlunoTurma() {
//        return vinculoAlunoTurma;
//    }

    @Override
    public String toString() {
        return "Observacao{" + "id=" + id + ", descricao=" + descricao + '}';
    }
    
    
    
    
    
    
}
