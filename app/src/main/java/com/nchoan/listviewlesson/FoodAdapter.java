package com.nchoan.listviewlesson;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by hungnm24 on 4/17/20
 * Copyright (c) {2020} VinID. All rights reserved.
 */

public class FoodAdapter extends ArrayAdapter<FoodModel> {

    FoodModel[] foodModels;

    public FoodAdapter(@NonNull Context context, FoodModel[] foodModels) {
        super(context, R.layout.item_view, foodModels);
        this.foodModels = foodModels;
    }

    @SuppressLint("DefaultLocale")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            view = layoutInflater.inflate(R.layout.item_view, null);
        } else {
            view = convertView;
        }

        FoodModel item = foodModels[position];
        setDataToView(item, view);

        return view;
    }


    private void setDataToView(FoodModel item, View view){
        TextView tvGroupName = view.findViewById(R.id.tvGroupName);
        tvGroupName.setText(item.getGroupName());

        TextView tvName = view.findViewById(R.id.tvName);
        tvName.setText(item.getName());

        TextView tvPrice = view.findViewById(R.id.tvPrice);
        tvPrice.setText(String.format ("%.2f$", item.getPrice()));

        ImageView ivThumb = view.findViewById(R.id.ivThumb);
        ivThumb.setImageResource(item.getThumbnail());
    }
}