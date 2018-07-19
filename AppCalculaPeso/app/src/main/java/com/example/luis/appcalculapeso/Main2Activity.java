package com.example.luis.appcalculapeso;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main2Activity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listaIMC;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listaIMC = findViewById(R.id.listaIMC);
        String [] lista = {getString(R.string.FaixaPeso1Referencia), getString(R.string.FaixaPeso2Referencia), getString(R.string.FaixaPeso3Referencia), getString(R.string.FaixaPeso4Referencia),getString(R.string.FaixaPeso5Referencia),getString(R.string.FaixaPeso6Referencia),getString(R.string.FaixaPeso7Referencia)};
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista);

        listaIMC.setAdapter(adapter);
    }



}
