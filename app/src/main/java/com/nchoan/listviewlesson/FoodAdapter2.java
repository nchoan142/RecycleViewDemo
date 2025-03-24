package com.nchoan.listviewlesson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by hungnm24 on 4/20/20
 * Copyright (c) {2020} VinID. All rights reserved.
 */

public class FoodAdapter2 extends RecyclerView.Adapter<FoodAdapter2.ViewHolder> {

    FoodModel[] foodModels;
    Context context;

    public FoodAdapter2(@NonNull Context context, FoodModel[] foodModels) {
        this.foodModels = foodModels;
        this.context = context;
    }

    // Trả về 1 ViewHolder chứa view mới được tạo
    // Chuyển 1 file xml thành 1 đối tượng View
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        // Chuyển 1 file xml thành 1 đối tượng View
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        FoodModel item = foodModels[position];
        setDataToView(item, holder.getView());
    }

    @Override
    public int getItemCount() {
        return foodModels.length;
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

    static class ViewHolder extends RecyclerView.ViewHolder {
        View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
        }

        View getView() {
            return view;
        }
    }
}
