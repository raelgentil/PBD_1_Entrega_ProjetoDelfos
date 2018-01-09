/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.dao;

import br.com.delfos.modelo.conexao.ConnectionFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author rafaelgentil
 */
public class DaoGenerico<T extends EntidadeBase> {

    private static EntityManager manager = ConnectionFactory.getEntityManager();

    public T encontrarId(Class<T> clazz, Long id) {
        return manager.find(clazz, id);
    }

    public void savarOuAtualizar(T obj) {
        try {
            manager.getTransaction().begin();
            if (obj.getId() == null) {
                manager.persist(obj);
            } else {
                manager.merge(obj);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

    public void remover(Class<T> clazz, Long id) {
        T t = encontrarId(clazz, id);
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

}
