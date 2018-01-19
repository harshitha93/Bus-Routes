package com.example.harshithabshekharap.walmartassignment.MVP;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextThemeWrapper;

import com.example.harshithabshekharap.walmartassignment.BusRoutesAdapter;
import com.example.harshithabshekharap.walmartassignment.ResponseModel;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiClient;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Harshitha.bshekharap on 1/19/2018.
 */

public class RetrofitConnector {

    private ApiInterface api;
    BusRoutesAdapter busRoutesAdapter;
    Context _context;

    public RetrofitConnector(Context c) {
        this._context = c;;
    }


    public void loadRoutes(final Context context, final RecyclerView bus_routes_rv){
        api = ApiClient.getClient().create(ApiInterface.class);
        Call<ResponseModel> call = api.getBusRoutesData();

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel>call, Response<ResponseModel> response) {
                //List<BusRoutesModel> movies = response.body();
                if (response.code()==200){
                    Log.d("check", "Number of movies received: " + response.body().getBusRoutesModels().size());

                    busRoutesAdapter = new BusRoutesAdapter(context,response.body().getBusRoutesModels());

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
