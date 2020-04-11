package com.company;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(this.cost < 0){
            this.cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        if(this.cost < 0){
            this.cost = 0;
        }
        return this.cost;
    }
}
