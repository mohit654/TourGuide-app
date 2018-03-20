package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.id;

/**
 * Created by user on 05-06-2017.
 */

public class ImageAdapter extends ArrayAdapter<Home> {

    public ImageAdapter(Activity context,  ArrayList<Home> home) {
        super(context,0,home);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View list_item_view = convertView;
        if (list_item_view == null)
        {
            list_item_view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        final Home home = getItem(position);
        ImageView imageView = (ImageView) list_item_view.findViewById(id.image_view);
        imageView.setImageResource(home.getImageResorce());

        final TextView textView = (TextView) list_item_view.findViewById(id.text_view);
        textView.setText(home.getTextResource());
        list_item_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView1 = (TextView) v.findViewById(id.text1);
                if (textView1.getVisibility()==View.GONE)
                {
                    textView1.setText(home.getResource());
                    textView1.setVisibility(View.VISIBLE);
                }
                else {
                    textView1.setVisibility(View.GONE);
                }

            }
        });
        //TextView textView1 = (TextView) list_item_view.findViewById(id.text1);
        //textView1.setText(home.getResource());
        return list_item_view;
    }
}
