package com.example.uc13100562.listviewolx;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends Activity {
    TextView nomeProduto;
    TextView descricao;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nomeProduto = findViewById(R.id.tvNomeProduto2);
        descricao = findViewById(R.id.tvDescricao);
        imageView = findViewById(R.id.imgProduto);

        Produto produto = (Produto) getIntent().getSerializableExtra("produto");


        nomeProduto.setText(produto.getNome());
        descricao.setText(produto.getDescricao());

        Resources resources = this.getResources();

        TypedArray typedArray = resources.obtainTypedArray(R.array.imagens);

        imageView.setImageDrawable(typedArray.getDrawable(produto.getImagem()));
    }

}
