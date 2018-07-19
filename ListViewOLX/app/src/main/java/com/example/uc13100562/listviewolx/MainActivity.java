package com.example.uc13100562.listviewolx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{
    ListView lvProdutos ;
    ArrayList<Produto> listaProdutos;
    ProdutoAdapter produtoAdapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProdutos = findViewById(R.id.listProduto);

        listaProdutos = new ArrayList<Produto>();

        listaProdutos.add(new Produto(0,"Brasilia","Parafuso",100));
        listaProdutos.add(new Produto(1,"Taguatinga","Caderno",200));
        listaProdutos.add(new Produto(2,"Ceilandia","Caneta",300));
        listaProdutos.add(new Produto(3,"Gama","Martelo",400));
        listaProdutos.add(new Produto(4,"Gama","Mesa",400));


        produtoAdapter = new ProdutoAdapter(this, listaProdutos);
        lvProdutos.setAdapter(produtoAdapter);
        lvProdutos.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent =new Intent(this,Main2Activity.class);
        intent.putExtra("produto",listaProdutos.get(i));
        startActivity(intent);
    }
}
