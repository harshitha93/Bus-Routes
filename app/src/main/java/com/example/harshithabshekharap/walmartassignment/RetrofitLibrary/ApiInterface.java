package com.example.harshithabshekharap.walmartassignment.RetrofitLibrary;

import com.example.harshithabshekharap.walmartassignment.BusRoutesModel;
import com.example.harshithabshekharap.walmartassignment.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public interface ApiInterface {

    @GET("v2/5808f00d10000005074c6340")
    Call<ResponseModel> getBusRoutesData();

}
