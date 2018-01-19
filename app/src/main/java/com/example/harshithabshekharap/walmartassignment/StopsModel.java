package com.example.harshithabshekharap.walmartassignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class StopsModel implements Serializable{
    @SerializedName("name")
    @Expose
    String stopname;

    public String getStopname() {
        return stopname;
    }

    public void setStopname(String stopname) {
        this.stopname = stopname;
    }
}
