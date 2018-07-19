package com.example.luis.intentimplicita2;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{
    ListView listView;
    Intent intent;
    Uri url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.lista);
        String [] lista = {"a0","a1","a2","a3","a4","a5"};
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.strings));

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                intent = new Intent();
                intent.setAction(intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT,"texto");
                intent.setType("text/plain");
                startActivity(intent);
                break;

            case 1:
                url= Uri.parse("http://www.ucb.br");
                intent= new Intent(intent.ACTION_VIEW,url);
                startActivity(intent);
                break;

            case 2:
                url=Uri.parse("https://www.google.com.br/maps/place/Universidade+Cat%C3%B3lica+de+Brasilia/@-15.8651602,-48.0320834,17z/data=!3m1!4b1!4m5!3m4!1s0x935a2d99eddf2aeb:0x1f93c6652deda3dc!8m2!3d-15.8651602!4d-48.0298947");
                intent= new Intent(intent.ACTION_VIEW,url);
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(intent.ACTION_SEARCH).putExtra(SearchManager.QUERY,"Universidade Católica de Brasilia");
                startActivity(intent);
                break;


        }
    }
}
