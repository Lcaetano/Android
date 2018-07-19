package com.example.uc13100562.listviewcustomizado;

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
 * Created by UC13100562 on 17/04/2018.
 */

public class CarroAdapter extends BaseAdapter {

    Carro carro;

    public Context context;
    public List<Carro> listaCarros;

    public CarroAdapter(Context context, List<Carro> listaCarros) {
        this.context = context;
        this.listaCarros = listaCarros;
    }

    @Override
    public int getCount() {
        return listaCarros.size();
    }

    @Override
    public Object getItem(int i) {
        return listaCarros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        carro = (Carro) getItem(i);

        View linha = LayoutInflater.from(context).inflate(R.layout.item_carro,null);

        ImageView imageView = linha.findViewById(R.id.imgLogo);
        TextView textView = linha.findViewById(R.id.txtDescricao);

        Resources resources = context.getResources();

        TypedArray typedArray = resources.obtainTypedArray(R.array.logos);

        imageView.setImageDrawable(typedArray.getDrawable(carro.fabricante));
        textView.setText(carro.modelo);

        return linha;
    }
}
