/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.cliente.model;

import br.com.mvictor.primitive.model.AbstractEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author mvictor
 */

@Entity
@SequenceGenerator(name="pessoa_seq", sequenceName="pessoa_seq", initialValue=1, allocationSize=1)
public class Pessoa extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="nome", nullable=false)
    private String nome;
    @Column(name="cpf", nullable=false)
    private String cpf;
    @Column(name="rg", nullable=false)
    private String rg;
    @Column(name="dtNasc", nullable=false)
    private String dtNasc;
    @Column(name="sexo", nullable=false)
    private String sexo;
    @Column(name="estadoCivil", nullable=false)
    private String estadoCiv;
    
    /*
    @OneToMany(mappedBy="cliente", cascade= CascadeType.ALL)
    private List<Contato> contatos;
   
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="endereco_id", referencedColumnName="id", nullable=false)
    private Endereco endereco;
   */ 
    
    @OneToMany(mappedBy="pessoa", orphanRemoval=true)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Contato> contatos = new ArrayList<Contato>();
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Endereco endereco;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCiv() {
        return estadoCiv;
    }

    public void setEstadoCiv(String estadoCiv) {
        this.estadoCiv = estadoCiv;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
