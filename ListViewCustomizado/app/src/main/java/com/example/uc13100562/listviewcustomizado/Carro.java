package com.example.uc13100562.listviewcustomizado;

import java.io.Serializable;

/**
 * Created by UC13100562 on 17/04/2018.
 */

public class Carro implements Serializable{
    public String modelo;
    public int fabricante;

    public Carro(String modelo, int fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
}
