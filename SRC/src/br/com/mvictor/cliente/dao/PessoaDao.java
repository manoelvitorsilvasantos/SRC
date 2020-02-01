/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.cliente.dao;

import br.com.mvictor.cliente.model.Pessoa;
import br.com.mvictor.primitive.dao.DAO;
import java.util.List;
import javax.persistence.Query;



/**
 *
 * @author mvictor
 */
public class PessoaDao extends DAO <Pessoa> implements IPessoaDao{

    @Override
    public List<Pessoa> findByCPF(String cpf) {
       Query query = em.createNativeQuery("SELECT p.cpf FROM pessoa p WHERE p.cpf = ?", Pessoa.class);
       query.setParameter(1, cpf);
       List <Pessoa> lista = (List <Pessoa>) query.getSingleResult();
       return lista;
    }
    /*
    */ 

    @Override
    public boolean IsNullDAO() {
        return this.findAll() == null;
    }
}
