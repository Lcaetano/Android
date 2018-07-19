package com.example.luis.webservice;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class JsonUtils {
    public static Endereco getEndereco(String json) throws JSONException {
        Endereco endereco = new Endereco();
        JSONObject mJsonObject = new JSONObject(json);
         endereco.setCep(mJsonObject.getString("cep"));
         endereco.setLogradouro(mJsonObject.getString("logradouro"));
         endereco.setComplemento(mJsonObject.getString("complemento"));
         endereco.setBairro(mJsonObject.getString("bairro"));
         endereco.setLocalidade(mJsonObject.getString("localidade"));
         endereco.setUf(mJsonObject.getString("uf"));
         endereco.setUnidade(mJsonObject.getString("unidade"));
         endereco.setIbge(mJsonObject.getString("ibge"));
         endereco.setGia(mJsonObject.getString("gia"));

        return endereco;
    }
}
