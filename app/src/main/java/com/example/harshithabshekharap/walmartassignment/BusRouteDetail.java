package com.example.harshithabshekharap.walmartassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class BusRouteDetail  extends AppCompatActivity {


    TextView  route_name,route_description;
    ImageView route_imv;
    RecyclerView stops_rv;

    StopsAdapter stopsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_route_detail);

        route_name = (TextView)findViewById(R.id.route_name);
        route_description = (TextView)findViewById(R.id.route_description);
        route_imv = (ImageView)findViewById(R.id.route_imv);
        stops_rv = (RecyclerView)findViewById(R.id.stops_rv);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BusRouteDetail.this);
        stops_rv.setLayoutManager(linearLayoutManager);

        if (getIntent()!=null){
            BusRoutesModel busRoutesModel = (BusRoutesModel) getIntent().getSerializableExtra("routeModel");

            route_name.setText(busRoutesModel.getName());
            route_description.setText(busRoutesModel.getDescription());
            Picasso.with(BusRouteDetail.this).load(busRoutesModel.getImage()).fit().into(route_imv);

            stopsAdapter = new StopsAdapter(BusRouteDetail.this,busRoutesModel.getStopsList());
            stops_rv.setAdapter(stopsAdapter);

        }



    }
}
