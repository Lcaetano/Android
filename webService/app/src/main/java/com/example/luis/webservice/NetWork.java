package com.example.luis.webservice;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetWork {
    public static String getEndereco(String url){

        InputStream inputStream;
        String resultado = "";

        try{
            HttpURLConnection httpURLConnection;
            URL endPoint = new URL(url);
            httpURLConnection = (HttpURLConnection)endPoint.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.setReadTimeout(2000);

            inputStream = httpURLConnection.getInputStream();
            resultado  = parseToString(inputStream);

        }
        catch (Exception e){
            Log.v("exception", e.getMessage());
        }

        return resultado;

    }

    public static String parseToString(InputStream inputStream){

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String linha = null;

        try{
            while ((linha = bufferedReader.readLine()) != null){
                stringBuilder.append(linha);

            }
        }catch (Exception e){
            Log.v("exception", e.getMessage());
        }

        return stringBuilder.toString() ;
    }

}
