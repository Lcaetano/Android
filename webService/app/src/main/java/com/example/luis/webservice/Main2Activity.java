package com.example.luis.webservice;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

public class Main2Activity extends Activity {
     TextView cep;
     TextView logradouro;
     TextView complemento;
     TextView bairro;
     TextView localidade;
     TextView uf;
     TextView unidade;
     TextView ibge;
     TextView gia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cep = (TextView)findViewById(R.id.cep);
        logradouro = (TextView)findViewById(R.id.logradouro);
        complemento = (TextView)findViewById(R.id.complemento);
        bairro = (TextView)findViewById(R.id.bairro);
        localidade = (TextView)findViewById(R.id.localidade);
        uf = (TextView)findViewById(R.id.uf);
        unidade = (TextView)findViewById(R.id.unidade);
        ibge = (TextView)findViewById(R.id.ibge);
        gia = (TextView)findViewById(R.id.gia);

        String end = (String) getIntent().getStringExtra("end");

        String[] enderecoS = {end};
        EnderecoNet enderecoNet = new EnderecoNet();
        enderecoNet.execute(enderecoS);
    }
    public class EnderecoNet extends AsyncTask<String,Void,String> {

        ProgressDialog progressDialog;

        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(Main2Activity.this,"Aguarde","Buscando dados");
        }

        @Override
        protected String doInBackground(String... params) {
            return NetWork.getEndereco(params[0]);
        }

        protected void onPostExecute(String resultado){
            Endereco endereco = new Endereco();
            try {
                endereco=JsonUtils.getEndereco(resultado);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            progressDialog.dismiss();

            cep.setText(endereco.getCep());
            logradouro.setText(endereco.getLogradouro());
            complemento.setText(endereco.getComplemento());
            bairro.setText(endereco.getBairro());
            localidade.setText(endereco.getLocalidade());
            uf.setText(endereco.getUf());
            unidade.setText(endereco.getUnidade());
            ibge.setText(endereco.getIbge());
            gia.setText(endereco.getGia());

        }
    }
}
