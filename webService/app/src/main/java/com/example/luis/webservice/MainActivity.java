package com.example.luis.webservice;

import android.app.Activity;
import android.content.Intent;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{
    Intent intent;
    EditText cep;
    Uri url;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cep = (EditText)findViewById(R.id.etCep);
        ok = findViewById(R.id.enviar);


        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String end = "https://viacep.com.br/ws/"+cep.getText()+"/json/";
        intent = new Intent(this, Main2Activity.class);
        intent.putExtra("end",end);
        startActivity(intent);
    }


}
