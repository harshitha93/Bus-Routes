package com.example.harshithabshekharap.walmartassignment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

public class BusRoutesAdapter extends RecyclerView.Adapter<BusRoutesAdapter.ViewHolder> {

    private Context _context;

    private ArrayList<BusRoutesModel> bus_routes_list = new ArrayList<>();


    public BusRoutesAdapter(Context mContext, ArrayList<BusRoutesModel> list) {
        this._context = mContext;
        this.bus_routes_list = list;
    }


    @Override
    public BusRoutesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bus_route_item_layout, parent, false);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(final BusRoutesAdapter.ViewHolder holder, final int position) {


        holder.route_name.setText(bus_routes_list.get(position).getName());
        try {
            loadImage(_context,bus_routes_list.get(position).getImage(),holder.route_image);

        }catch (Exception e){
            Log.d("exceptionImage",""+e.toString());
        }

        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(_context,BusRouteDetail.class);
                intent.putExtra("routeModel",bus_routes_list.get(position));
                _context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bus_routes_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CustomTextView route_name;
        ImageView route_image;
        RelativeLayout parent_layout;

        public ViewHolder(View itemView) {
            super(itemView);

            route_name = (CustomTextView) itemView.findViewById(R.id.bus_route_name);
            route_image = (ImageView) itemView.findViewById(R.id.route_image);
            parent_layout = (RelativeLayout)itemView.findViewById(R.id.parent_layout);

        }
    }

    public static void loadImage(Context _context,String url, ImageView imageView){

         Picasso.with(_context).load(url).fit().into(imageView) ;
    }
}

