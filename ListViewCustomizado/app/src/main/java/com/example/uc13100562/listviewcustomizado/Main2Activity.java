package com.example.uc13100562.listviewcustomizado;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Main2Activity extends Activity {
    TextView tvCor;
    TextView tvModelo;
    TextView tvPortas;
    TextView tvAno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvAno= findViewById(R.id.tvAno);
        tvCor = findViewById(R.id.tvCor);
        tvModelo = findViewById(R.id.tvModelo);
        tvPortas = findViewById(R.id.tvPortas);
    }



}
