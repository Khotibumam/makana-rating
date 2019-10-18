package com.example.makananfavorit;

public class food {
    private String name;
    private float rate;
    private double price;
    private boolean fave;

    public food(String name, float rate, double price, boolean fave) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.fave = fave;
    }


    public boolean isFave() {
        return fave;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public double getPrice() {
        return price;
    }
}
