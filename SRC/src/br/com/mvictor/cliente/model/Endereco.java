/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.cliente.model;

import br.com.mvictor.primitive.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
/**
 *
 * @author mvictor
 */
@Entity
@SequenceGenerator(name="endereco_seq", sequenceName="endereco_seq", initialValue=1, allocationSize=1)
public class Endereco implements  Serializable {
    
    
    private static final long serialVersionUID = 1L; 
    
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="rua", nullable=false)
    private String rua;
    @Column(name="bairro", nullable=false)
    private String bairro;
    @Column(name="complemento", nullable=false)
    private String complemento;
    @Column(name="numero", nullable=false)
    private int numero;
    @Column(name="cep", nullable=false)
    private String cep;
    @Column(name="cidade", nullable=false)
    private String cidade;
    @Column(name="estado", nullable=false)
    private String estado;
    
    /*
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_pessoa", referencedColumnName="id")
    private Pessoa pessoa;
    */
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


  


    
    
}
