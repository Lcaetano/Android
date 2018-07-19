package com.example.uc13100562.fragment;

import java.io.Serializable;

/**
 * Created by UC13100562 on 22/05/2018.
 */

public class Hotel implements Serializable{
    public String nome;
    public String endereco;
    public float estrelas;

    public Hotel(String nome, String endereco, float estrelas) {
        this.nome = nome;
        this.endereco = endereco;
        this.estrelas = estrelas;
    }

    @Override
    public String toString() {
        return  nome;
    }
}
