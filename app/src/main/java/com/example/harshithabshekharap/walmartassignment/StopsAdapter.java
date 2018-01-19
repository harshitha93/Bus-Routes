package com.example.harshithabshekharap.walmartassignment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Harshitha.bshekharap on 1/18/2018.
 */

class StopsAdapter extends RecyclerView.Adapter<StopsAdapter.ViewHolder> {

    private Context _context;

    private ArrayList<StopsModel> stops_list = new ArrayList<>();


    public StopsAdapter(Context mContext, ArrayList<StopsModel> list) {
        this._context = mContext;
        this.stops_list = list;
    }


    @Override
    public StopsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stops_item_layout, parent, false);
        return new StopsAdapter.ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(final StopsAdapter.ViewHolder holder, final int position) {

        holder.stop_name.setText(stops_list.get(position).getStopname());

        if (position==stops_list.size()-1){
            holder.vertical_line.setVisibility(View.GONE);
        }
        else {
            holder.vertical_line.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return stops_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView stop_name;
        View sub_indicator1,sub_indicator2;
        ImageView vertical_line;

        public ViewHolder(View itemView) {
            super(itemView);

            stop_name = (TextView)itemView.findViewById(R.id.stop_name);
            sub_indicator1 = (View)itemView.findViewById(R.id.sub_indicator1);
            sub_indicator2 = (View)itemView.findViewById(R.id.sub_indicator2);
            vertical_line = (ImageView)itemView.findViewById(R.id.line);


        }
    }

}


