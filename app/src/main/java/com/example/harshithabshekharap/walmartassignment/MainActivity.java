package com.example.harshithabshekharap.walmartassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiClient;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView bus_routes_rv;
    BusRoutesAdapter busRoutesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bus_routes_rv = (RecyclerView)findViewById(R.id.bus_routes_rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        bus_routes_rv.setLayoutManager(linearLayoutManager);


        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ResponseModel> call = apiService.getBusRoutesData();

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel>call, Response<ResponseModel> response) {
                //List<BusRoutesModel> movies = response.body();
                if (response.code()==200){
                    Log.d("check", "Number of movies received: " + response.body().getBusRoutesModels().size());

                    busRoutesAdapter = new BusRoutesAdapter(MainActivity.this,response.body().getBusRoutesModels());

                    bus_routes_rv.setAdapter(busRoutesAdapter);

                }
            }

            @Override
            public void onFailure(Call<ResponseModel>call, Throwable t) {
                // Log error here since request failed
                Log.e("failure", t.toString());
            }
        });


    }

}
