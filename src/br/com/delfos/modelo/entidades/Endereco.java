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
public class Endereco implements Serializable, EntidadeBase{
    @Id
    @SequenceGenerator(name = "seq_municipio", sequenceName = "seq_municipio_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_municipio", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "cep", nullable = false)
    private int cep;
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    @Column(name = "numero", nullable = false)
    private String numero;
    @Column(name = "bairro", nullable = false, length = 255)
    private String bairro;
    @Column(name = "complemento", nullable = false, length = 255)
    private String complemento;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "municipio_id", referencedColumnName = "id", nullable = false)
    private Municipio municipio;

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
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the municipio
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cep=" + cep + ", descricao=" + descricao + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", municipio=" + municipio + '}';
    }
    
    
    
    
}
