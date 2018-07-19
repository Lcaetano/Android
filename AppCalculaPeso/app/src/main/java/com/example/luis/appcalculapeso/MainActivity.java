package com.example.luis.appcalculapeso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btnCalcular;
    Button btnReferencia;
    EditText etPeso;
    EditText etAltura;
    ImageView imagePeso;
    TextView situcaoPeso;
    Intent intent;
    TextView imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = findViewById(R.id.calcular);
        btnReferencia = findViewById(R.id.ValorReferncia);
        etPeso= findViewById(R.id.peso);
        etAltura = findViewById(R.id.altura);
        imagePeso = findViewById(R.id.imagemPeso);
        situcaoPeso = findViewById(R.id.situacao);
        imc = findViewById(R.id.IMC);
        btnReferencia.setOnClickListener(this);
        btnCalcular.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        double imcValor=0;
        double peso=0,altura=0;
        if (v.getId() == R.id.calcular){
            if(etPeso.getText().toString().compareTo("") == 0 || etAltura.getText().toString().compareTo("") == 0){
                Toast.makeText(this,"Informe Valores", Toast.LENGTH_LONG).show();
            } else{
                altura = Double.parseDouble(etAltura.getText().toString());
                peso = Double.parseDouble(etPeso.getText().toString());

                imcValor = peso / Math.pow(altura, 2);
                DecimalFormat formato = new DecimalFormat("#.##");
                imcValor = Double.valueOf(formato.format(imcValor));
                imc.setText(imcValor+"");

                if(imcValor<17.0){
                    situcaoPeso.setText(R.string.FaixaPeso1);
                }else{
                    if(imcValor<18.49){
                        situcaoPeso.setText(R.string.FaixaPeso2);
                    }else{
                        if(imcValor<24.99){
                            situcaoPeso.setText(R.string.FaixaPeso3);
                        }else{
                            imagePeso.setImageResource(R.drawable.pessoagorda);
                            if(imcValor<29.99){
                                situcaoPeso.setText(R.string.FaixaPeso4);
                            }else{
                                if(imcValor<34.99){
                                    situcaoPeso.setText(R.string.FaixaPeso5);
                                }else{
                                    if(imcValor<39.99){
                                        situcaoPeso.setText(R.string.FaixaPeso6);
                                    }else{
                                        situcaoPeso.setText(R.string.FaixaPeso7);

                                    }
                                }
                            }
                        }
                    }
                }
            }


        }else{
            intent =new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
    }
}
