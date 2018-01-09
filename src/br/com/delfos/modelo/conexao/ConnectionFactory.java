/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delfos.modelo.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rafaelgentil
 */
public class ConnectionFactory {
 
 private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("DelfosModelPU");
 
 public static EntityManager getEntityManager(){
 return factory.createEntityManager();
 }
 
}