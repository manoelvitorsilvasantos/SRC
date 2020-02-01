/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.app.tableModel;

import br.com.mvictor.cliente.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface ITableModel {
    /**
     * A linhas contendo o conteudo da tabela.
     */
    public List <Pessoa> lista=  new ArrayList();

    /**
     * as colunas da tabelas custumizavéis, contendo os titulo para cada coluna.
     */
    public String[] colunas = new String[]
    {
        "ID",
        "Nome",
        "CPF",
        "RG",
        "DtNasc",
        "Sexo",
        "EstadoCiv"
    };
}
