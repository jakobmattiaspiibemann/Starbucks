package com.example.opilane.starbucks;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    String name, description;
    int imageResourceId;
    private List<Drink> list = new ArrayList<>();

    public void Drink(String name, String description, int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static final String[] [] data={
            {"Latte", "A shot of foamy espresso with steamed milk", R.drawable.latte},
            {"Cappucino", R.drawable.cappucino},
            {"Filter", R.drawable.filter}
    };
}
