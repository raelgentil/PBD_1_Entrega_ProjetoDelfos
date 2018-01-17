/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rafaelgentil
 */
@Entity
public class Turma implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_turma", sequenceName = "seq_turma_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_turma", strategy = GenerationType.SEQUENCE)    
    private Long id;
    @Column(name = "codigo", nullable = false, length = 50)
    private String codigo;
    @Column(name = "quantidade_vagas", nullable = false)
    private int quantidadeVagas;
    @Column(name = "nome", nullable = false, length = 255)
    private String nome;
    @Column(name = "horario_aula", nullable = false, length = 50)
    private String horarioAula;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "semestre_id", referencedColumnName = "id", nullable = false)
//    private Semestre semestre;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "professor_id", referencedColumnName = "id", nullable = false)
//    private Professor professor;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "disciplina_id", referencedColumnName = "id", nullable = false)
//    private Disciplina disciplina;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "turma_id")
    List<Aula> aulas;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "turma_id")
    List<VinculoAlunoTurma> vinculosAlunoTurma;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="Aluno_",
             joinColumns={@JoinColumn(name = "vinculo_aluno_turma_id")},
             inverseJoinColumns={@JoinColumn(name = "observacao_id")})
    List<Observacao> observacaos;
   

    private Turma() {}

    public Turma(String codigo, int quantidadeVagas, String nome, String horarioAula, List<Aula> aulas) {
        
        this.codigo = codigo;
        this.quantidadeVagas = quantidadeVagas;
        this.nome = nome;
        this.horarioAula = horarioAula;
        this.aulas = aulas;
    }
 

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the quantidadeVagas
     */
    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the horarioAula
     */
    public String getHorarioAula() {
        return horarioAula;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", codigo=" + codigo + ", quantidadeVagas=" + quantidadeVagas + ", nome=" + nome + ", horarioAula=" + horarioAula + ", aulas=" + aulas + '}';
    }


    

    
 
}
