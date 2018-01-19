package com.example.harshithabshekharap.walmartassignment.MVP;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harshithabshekharap.walmartassignment.BusRoutesAdapter;
import com.example.harshithabshekharap.walmartassignment.BusRoutesModel;
import com.example.harshithabshekharap.walmartassignment.MainActivity;
import com.example.harshithabshekharap.walmartassignment.R;
import com.example.harshithabshekharap.walmartassignment.ResponseModel;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiClient;
import com.example.harshithabshekharap.walmartassignment.RetrofitLibrary.ApiInterface;
import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpFragment;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */


public class LandingActivity extends MvpActivity<RoutesView,RoutesPresenter>{

   RecyclerView bus_routes_rv;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);
        bus_routes_rv = (RecyclerView)findViewById(R.id.bus_routes_rv);
        presenter.asyncCall(LandingActivity.this,bus_routes_rv);
    }

    @NonNull
    @Override
    public RoutesPresenter createPresenter() {
        return new RoutesPresenter();
    }

}

