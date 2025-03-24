package com.nchoan.listviewlesson;

/**
 * Created by hungnm24 on 4/17/20
 * Copyright (c) {2020} VinID. All rights reserved.
 */

public class FoodModel {
    private String name;
    private String groupName;
    private float price;
    private int thumbnail;
    
    public FoodModel(String name, String groupName, float price, int thumbnail) {
        this.name = name;
        this.groupName = groupName;
        this.price = price;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public float getPrice() {
        return price;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
