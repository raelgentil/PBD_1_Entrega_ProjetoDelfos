/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class VinculoAlunoTurma implements Serializable, EntidadeBase{
    @Id
    Long id;
    double va1;
    double va2;
    double va3;
    double mediaParcial;
    double vaFinal;
    double mediaFinal;
    int quantFaltas;
    String situacao;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vinculo_aluno_turma_id")
    List<Falta> faltas;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="aluno_observacao",
             joinColumns={@JoinColumn(name = "vinculo_aluno_turma_id")},
             inverseJoinColumns={@JoinColumn(name = "observacao_id")})
    List<Observacao> observacaos;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
