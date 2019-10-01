package com.example.edik.pizza;

public class Pizza {
    public String getName() {
        return name;
    }

    private String name;
    private int imageResourceId;

    public static final Pizza pizzas[] = {
            new Pizza("Diavolo",R.drawable.diavolo),
            new Pizza("Funghi",R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId){
        this.name=name;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
