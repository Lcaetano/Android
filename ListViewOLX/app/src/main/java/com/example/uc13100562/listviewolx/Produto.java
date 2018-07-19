package com.example.uc13100562.listviewolx;

import java.io.Serializable;

/**
 * Created by UC13100562 on 24/04/2018.
 */

public class Produto implements Serializable{
    private  int imagem;
    private String localidade;
    private  String nome;
    private double preco;
    private  String descricao;

    public Produto(int imagem, String localidade, String nome, double preco) {
        this.imagem = imagem;
        this.localidade = localidade;
        this.nome = nome;
        this.preco = preco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
