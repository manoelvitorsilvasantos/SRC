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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author mvictor
 */
@Entity
public class Contato extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="celP", nullable=false)
    private String CelP;
    @Column(name="celS", nullable=false)
    private String CelS;
    @Column(name="email", nullable=false)
    private String Email;
    
    /*
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cliente_id", referencedColumnName="id",  insertable = true, updatable = true, nullable=false)
    private Pessoa cliente;
    */
    
    @ManyToOne
    @JoinColumn(name="pessoa", nullable=false)
    private Pessoa pessoa = new Pessoa();

    
    /**
     *
     * @return
     */
    public String getCelP() {
        return CelP;
    }

    public void setCelP(String CelP) {
        this.CelP = CelP;
    }

    public String getCelS() {
        return CelS;
    }

    public void setCelS(String CelS) {
        this.CelS = CelS;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    

   

}
