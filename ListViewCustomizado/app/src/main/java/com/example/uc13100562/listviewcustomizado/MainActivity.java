package com.example.uc13100562.listviewcustomizado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    CarroAdapter carroAdapter;
    ListView listView;
    List<Carro> listaCarro;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        listaCarro = new ArrayList<Carro>();

        listaCarro.add(new Carro("PALIO",0));
        listaCarro.add(new Carro("FOCUS",1));
        listaCarro.add(new Carro("VECTRA",2));
        listaCarro.add(new Carro("GOLF",3));


        carroAdapter = new CarroAdapter(this,listaCarro);
        listView.setAdapter(carroAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent = new Intent(this, Main2Activity.class);
        Carro carro = listaCarro.get(i);
        intent.putExtra("car",carro);

        startActivity(intent);
    }
}
