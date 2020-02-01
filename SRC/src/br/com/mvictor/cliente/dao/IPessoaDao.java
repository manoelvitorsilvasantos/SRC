/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.cliente.dao;

import br.com.mvictor.cliente.model.Pessoa;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface IPessoaDao{

    /**
     *
     * @param cpf
     * @return
     */
    public abstract List<Pessoa>findByCPF(String cpf);
    public abstract boolean IsNullDAO();
}
