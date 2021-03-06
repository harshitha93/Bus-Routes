package com.example.harshithabshekharap.walmartassignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class BusRoutesModel implements Serializable {


    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("accessible")
    @Expose
    boolean accessible;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("stops")
    @Expose
    ArrayList<StopsModel> stopsList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<StopsModel> getStopsList() {
        return stopsList;
    }

    public void setStopsList(ArrayList<StopsModel> stopsList) {
        this.stopsList = stopsList;
    }
}
