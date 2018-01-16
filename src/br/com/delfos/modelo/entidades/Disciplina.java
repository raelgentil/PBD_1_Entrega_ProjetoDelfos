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
public class Disciplina implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_disciplina", sequenceName = "seq_disciplina_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_disciplina", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "nome", nullable = false, length = 255)
    private String nome;
    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;
    @Column(name = "creditos", nullable = false, columnDefinition="TEXT")
    private String creditos;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "curso_id", referencedColumnName = "id", nullable = false)
    private Curso curso;

    private Disciplina() {
    }

    public Disciplina(String nome, int cargaHoraria, String creditos, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
        this.curso = curso;
    }

    public Disciplina(Long id, String nome, int cargaHoraria, String creditos, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
        this.curso = curso;
    }
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @return the creditos
     */
    public String getCreditos() {
        return creditos;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", creditos=" + creditos + ", curso=" + curso + '}';
    }
    
    
    
    
}
