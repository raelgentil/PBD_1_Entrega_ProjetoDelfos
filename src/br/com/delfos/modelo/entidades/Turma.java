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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "semestre_id", referencedColumnName = "id", nullable = false)
    private Semestre semestre;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id", referencedColumnName = "id", nullable = false)
    private Professor professor;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id", nullable = false)
    private Disciplina disciplina;

    private Turma() {
    }
    

    public Turma(String codigo, int quantidadeVagas, String nome, String horarioAula, Semestre semestre, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.quantidadeVagas = quantidadeVagas;
        this.nome = nome;
        this.horarioAula = horarioAula;
        this.semestre = semestre;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Turma(Long id, String codigo, int quantidadeVagas, String nome, String horarioAula, Semestre semestre, Professor professor, Disciplina disciplina) {
        this.id = id;
        this.codigo = codigo;
        this.quantidadeVagas = quantidadeVagas;
        this.nome = nome;
        this.horarioAula = horarioAula;
        this.semestre = semestre;
        this.professor = professor;
        this.disciplina = disciplina;
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

    /**
     * @return the semestre
     */
    public Semestre getSemestre() {
        return semestre;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", codigo=" + codigo + ", quantidadeVagas=" + quantidadeVagas + ", nome=" + nome + ", horarioAula=" + horarioAula + ", semestre=" + semestre + ", professor=" + professor + ", disciplina=" + disciplina + '}';
    }
    
    
    
    
}
