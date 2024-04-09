package com.example.planetsapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapter extends ArrayAdapter<planet> {
    private ArrayList<planet> planetsArraylist;

    Context context;

    public myCustomAdapter(ArrayList<planet> planetsArraylist, Context context1) {
        super(context1, R.layout.items_list_layout, planetsArraylist);
        this.planetsArraylist = planetsArraylist;
        this.context = context1;
    }

    static class myviewholder{
        TextView planetname;
        TextView mooncount;
        ImageView planetimg;
    }

    //getview()-used to create and return a view for a specific item in the list;


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the planet object for the current position
        planet planets = getItem(position);

        //inflate
        myviewholder holder;
        final View result;

        if (convertView==null){
            holder = new myviewholder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.items_list_layout,
                    parent,
                    false
            );

            holder.planetname = (TextView) convertView.findViewById(R.id.planets);
            holder.mooncount = (TextView) convertView.findViewById(R.id.moons);
            holder.planetimg = (ImageView) convertView.findViewById(R.id.imageview);

            result = convertView;

            convertView.setTag(holder);

        }else {
            holder = (myviewholder) convertView.getTag();
            result = convertView;
        }

        holder.planetname.setText(planets.getPlanetname());
        holder.mooncount.setText(planets.getMooncount());
        holder.planetimg.setImageResource(planets.getPlanetimg());

        return result;

    }
}
