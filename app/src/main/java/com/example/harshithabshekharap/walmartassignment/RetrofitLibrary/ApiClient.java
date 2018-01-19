package com.example.harshithabshekharap.walmartassignment.RetrofitLibrary;

import android.util.Log;

import com.example.harshithabshekharap.walmartassignment.BusRoutesModel;
import com.example.harshithabshekharap.walmartassignment.ResponseModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class ApiClient {

    public static final String BASE_URL = "http://www.mocky.io/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {


//        Gson gson = null;
//        try{
//            BusRoutesModel[] enums = gson.fromJson(yourJson, channelSearchEnum[].class);
//
//            gson = new GsonBuilder().registerTypeAdapter(ResponseModel.class, new BusRoutesModel()).create();
//
//        }catch (Exception e){
//            Log.d("exception=:",""+e.toString());
//        }

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
