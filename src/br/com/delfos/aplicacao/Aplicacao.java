
package br.com.delfos.aplicacao;

import br.com.delfos.modelo.dao.DaoGenerico;
import br.com.delfos.modelo.entidades.Estado;

/**
 *
 * @author rafaelgentil
 */
public class Aplicacao {
    
    public static void main(String[] args) {
//        Estado e = new Estado();
        
        DaoGenerico<Estado> estadoDao = new DaoGenerico<Estado>();
//        e.setUf("SA");
//        e.setDescricao("Sjkfwjfwje");
//        
//        estadoDao.savarOuAtualizar(e);
         System.out.println("Entidades salvas com sucesso!");
        
         Estado estado = estadoDao.encontrarId(Estado.class, 3l);
         System.out.println(estado.toString());
        
    }
    
}
