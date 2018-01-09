package br.com.delfos.modelo.entidades;

import br.com.delfos.modelo.dao.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rafaelgentil
 *
 */
@Entity
public class Estado implements Serializable, EntidadeBase {

    @Id
    @SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_estado", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;
    @Column(name = "descricao", nullable = false, length = 50)
    private String descricao;

    public Estado() {
    }

    @Override
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
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
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

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", uf=" + uf + ", descricao=" + descricao + '}';
    }

    

    
}
