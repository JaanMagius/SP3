package com.company;

import java.sql.Timestamp;

public class Order extends Pizza {
    Timestamp orderTime;
    Timestamp deliveryTime = new Timestamp((long) (System.currentTimeMillis() + duration));
    private static float duration = ((59 * 60) + 59) * 1000; //default is 1 hour till pickup

    public Order(Pizza p) {
        super(p.name, p.IngredientsList, p.price);
        this.orderTime = new Timestamp(System.currentTimeMillis());
    }

    public Timestamp getTimestamp() {
        return orderTime;
    }

    public void setDeliveryTime() {
        this.deliveryTime.setTime((long)(orderTime.getTime() + duration));
    }

    public void setDuration(int a, int b){
        //a = mins & b = seconds
        this.duration = ((a * 60) + b) * 1000;
    }

    @Override
    public String toString() {
        return "\n" +
                "Pizza: " + name + "\n" +
                "Ingredienser: " + IngredientsList + " " +
                "Pris: " + price + ",-" +
                "Afhentningstidspunkt: " + deliveryTime;
    }
}