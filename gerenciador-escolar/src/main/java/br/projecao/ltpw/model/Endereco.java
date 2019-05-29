package br.projecao.ltpw.model;
// Generated 06/05/2019 22:18:44 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name="Endereco"
    ,catalog="projecao"
)
public class Endereco  implements java.io.Serializable {


     private int idEndereco;
     private String bairro;
     private String cep;
     private String complemento;
     private String logradodouro;
     private Set<Pessoa> pessoas = new HashSet<Pessoa>(0);

    public Endereco() {
    }

    public Endereco(String bairro, String cep, String complemento, String logradodouro, Set<Pessoa> pessoas) {
       this.bairro = bairro;
       this.cep = cep;
       this.complemento = complemento;
       this.logradodouro = logradodouro;
       this.pessoas = pessoas;
    }
   
     @Id @GeneratedValue

    
    @Column(name="idEndereco", unique=true, nullable=false)
    public int getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    
    @Column(name="bairro", length=45)
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name="CEP", length=45)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name="complemento", length=45)
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    @Column(name="logradodouro", length=100)
    public String getLogradodouro() {
        return this.logradodouro;
    }
    
    public void setLogradodouro(String logradodouro) {
        this.logradodouro = logradodouro;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Pessoa_Endereco", catalog="projecao", joinColumns = { 
        @JoinColumn(name="Endereco_idEndereco", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="Pessoa_idPessoa", nullable=false, updatable=false) })
    public Set<Pessoa> getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }




}


