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
public class Falta implements Serializable, EntidadeBase{
   @Id
   @SequenceGenerator(name = "seq_falta", sequenceName = "seq_falta_id", allocationSize = 1)
   @GeneratedValue(generator = "seq_falta", strategy = GenerationType.SEQUENCE)
   private Long id;
   @Column(name = "nome", nullable = false, length = 2)
   private String tipo;
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name = "aula_id", referencedColumnName = "id", nullable = false)
   private Aula aula;
//   @ManyToOne(cascade=CascadeType.ALL)
//   @JoinColumn(name = "vinculo_aluno_turma_id")
//   private VinculoAlunoTurma vinculoAlunoTurma;

    private Falta() {
    }

    public Falta(String tipo, Aula aula) {
        this.tipo = tipo;
        this.aula = aula;
    }


    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the aula
     */
    public Aula getAula() {
        return aula;
    }

    /**
     * @return the vinculoAlunoTurma
     */
//    public VinculoAlunoTurma getVinculoAlunoTurma() {
//        return vinculoAlunoTurma;
//    }

    @Override
    public String toString() {
        return "Falta{" + "id=" + id + ", tipo=" + tipo + ", aula=" + aula + '}';
    }
    
    
    
}
