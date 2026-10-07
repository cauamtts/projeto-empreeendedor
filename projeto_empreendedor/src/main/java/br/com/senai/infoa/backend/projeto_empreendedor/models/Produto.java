package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "produto")
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="nome")
    private String nome;

    @Column(name ="dataFabricacao")
    private String dataFabricacao;

    @Column(name ="preco")
    private Double preco;
    @ManyToMany 
    @JoinTable (
        name = "empreendedor_produto", 
        joinColumns = @JoinColumn(name = "id_produto"),
        inverseJoinColumns = @JoinColumn(name = "id_empreendedor") 
    )
    private List<Empreendedor> empreendedores; // essa estrutura representa o join table entre empreendedor e produto, onde cada empreendedor pode ter varios produtos e cada produto pode pertencer a varios empreendedores.

    public Produto() {
    }

    public Produto(String dataFabricacao, Integer id, String nome, Double preco) {
        this.dataFabricacao = dataFabricacao;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }
    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }
}
