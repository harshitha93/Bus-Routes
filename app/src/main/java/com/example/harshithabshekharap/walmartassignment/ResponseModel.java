package com.example.harshithabshekharap.walmartassignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class ResponseModel {

    @SerializedName("routes")
    @Expose
    ArrayList<BusRoutesModel> busRoutesModels = new ArrayList<>();

    public ArrayList<BusRoutesModel> getBusRoutesModels() {
        return busRoutesModels;
    }

    public void setBusRoutesModels(ArrayList<BusRoutesModel> busRoutesModels) {
        this.busRoutesModels = busRoutesModels;
    }
}
