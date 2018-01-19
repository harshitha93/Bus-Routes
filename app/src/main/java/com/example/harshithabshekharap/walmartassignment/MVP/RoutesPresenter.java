package com.example.harshithabshekharap.walmartassignment.MVP;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.harshithabshekharap.walmartassignment.BusRoutesAdapter;
import com.example.harshithabshekharap.walmartassignment.MainActivity;
import com.example.harshithabshekharap.walmartassignment.ResponseModel;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiClient;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiInterface;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class RoutesPresenter extends MvpBasePresenter<RoutesView> {


    private RetrofitConnector retrofitConnector ;

    public void asyncCall(Context ctx,RecyclerView recyclerView){
        retrofitConnector = new RetrofitConnector(ctx);
        retrofitConnector.loadRoutes(ctx,recyclerView);
    }



}
