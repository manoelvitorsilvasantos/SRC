/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.app.tableModel;

import br.com.mvictor.cliente.model.Pessoa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mvictor
 */
public class TableModel extends AbstractTableModel implements ITableModel{

    
    /**
     * @param listaAluno - o conteudo em si da tabela contendo as informações.
     * @param colunas - o titulo das colunas
     */
    
    
    /**
     * Método que retorna o texto para cada título.
     * @param linha - a linha que você que setar o texto..
     * @return 
     */
    @Override
    public String getColumnName(int linha)
    {
        return TableModel.colunas[linha];
    }
    
    /**
     * Método que retorna o número de linhass da tabela.
     * @return 
     */
    @Override
    public int getRowCount() {
        return TableModel.lista.size();
    }
    
    /**
     * Método que retorna o número de colunas.
     * @return 
     */
    @Override
    public int getColumnCount() {
        return TableModel.colunas.length;
    }
    
    /**
     * Método que gera o modelo da nossa tabela.
     * @param linhas - o número da linha que você que modificar.
     * @param colunas - o número da coluna que você que modificar.
     * @return 
     */
    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas)
        {
            
            case 0:
                return TableModel.lista.get(linhas).getId();
            case 1:
                return TableModel.lista.get(linhas).getNome();
            case 2:
                return TableModel.lista.get(linhas).getCpf();
            case 3:
                return TableModel.lista.get(linhas).getRg();
            case 4:
                return TableModel.lista.get(linhas).getDtNasc();
            case 5:
                return TableModel.lista.get(linhas).getSexo();
            case 6:
                return this.lista.get(linhas).getEstadoCiv();
        }
        return null;
    }
    
    /**
     * Método que adicionar um novo elemento na linha da tabela.
     * @param cliente
     */
    public void adicionarNovoElementoNaLinhaDaTabela(Pessoa cliente)
    {
        TableModel.lista.add(cliente);
        this.fireTableDataChanged();
    }
    
    /**
     * Método que adicionar um novo elemento na linha da tabela, especificando o index da linha.
     * @param index - o index da linha da tabela.
     * @param cliente 
     */
    public void adicionarNovaLinhaNaTabela(int index, Pessoa cliente)
    {
        TableModel.lista.add(index, cliente);
        this.fireTableDataChanged();
    }
    
    /**
     * Método que remova uma linha da tabela por do index dessa linha.
     * @param index - a posição da linha.
     */
    public void removerLinhaDaTabela(int index)
    {
        TableModel.lista.remove(index);
        this.fireTableDataChanged();
    }
    
    /**
     * Método responsável por limparTabela a tabela.
     */
    public void limparTabela()
    {
        TableModel.lista.clear();
        this.fireTableDataChanged();
    }
    
    /**
     * Método que atualiza as informações da tabela recebendo com paramentro uma lista.
     * @param lista - a lista contendo os dados.
     */
    public void atualizarListaTabela(List <Pessoa> lista)
    {
        TableModel.lista.clear();
        TableModel.lista.addAll(lista);
        this.fireTableDataChanged();
    }
    
}
