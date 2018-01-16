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
public class VinculoAlunoCurso implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_vinculo_aluno_curso", sequenceName = "seq_vinculo_aluno_curso_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_vinculo_aluno_curso", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "semestre_id", referencedColumnName = "id", nullable = false)
    private Semestre semestre;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "aluno_id", referencedColumnName = "id", nullable = false)
    private Aluno aluno;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "professor_id", referencedColumnName = "id", nullable = false)
    private Curso curso;

    public VinculoAlunoCurso() {
    }

    public VinculoAlunoCurso(boolean status, Semestre semestre, Aluno aluno, Curso curso) {
        this.id = id;
        this.status = status;
        this.semestre = semestre;
        this.aluno = aluno;
        this.curso = curso;
    }

    public VinculoAlunoCurso(Long id, boolean status, Semestre semestre, Aluno aluno, Curso curso) {
        this.id = id;
        this.status = status;
        this.semestre = semestre;
        this.aluno = aluno;
        this.curso = curso;
    }
    
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @return the semestre
     */
    public Semestre getSemestre() {
        return semestre;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "VinculoAlunoCurso{" + "id=" + id + ", status=" + status + ", semestre=" + semestre + ", aluno=" + aluno + ", curso=" + curso + '}';
    }
    
    
    
    
    
}
