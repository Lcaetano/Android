package com.example.uc13100562.listviewolx;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by UC13100562 on 24/04/2018.
 */

public class ProdutoAdapter extends BaseAdapter {
    Produto produto;

    public Context context;
    public List<Produto> listaProduto;

    public ProdutoAdapter(Context context, List<Produto> listaProduto) {
        this.context = context;
        this.listaProduto = listaProduto;
    }

    @Override
    public int getCount() {
        return listaProduto.size();
    }

    @Override
    public Object getItem(int i) {
        return listaProduto.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        produto = (Produto) getItem(i);

        View linha = LayoutInflater.from(context).inflate(R.layout.item_produto,null);
        Resources resources = context.getResources();

        TypedArray typedArray = resources.obtainTypedArray(R.array.imagens);

        ImageView imageView = linha.findViewById(R.id.imgProduto);
        TextView tvNomeProduto = linha.findViewById(R.id.tvNomeProduto);
        TextView tvPreco = linha.findViewById(R.id.tvPreco);
        TextView tvLocalidae = linha.findViewById(R.id.tvLocalidadeTempo);


        imageView.setImageDrawable(typedArray.getDrawable(produto.getImagem()));
        tvNomeProduto.setText(produto.getNome());
        tvPreco.setText(String.valueOf(produto.getPreco()));
        tvLocalidae.setText(produto.getLocalidade());


        return linha;
    }
}
